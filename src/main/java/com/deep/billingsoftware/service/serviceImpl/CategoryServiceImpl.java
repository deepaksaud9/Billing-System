package com.deep.billingsoftware.service.serviceImpl;

import com.deep.billingsoftware.dtos.request.CategoryRequest;
import com.deep.billingsoftware.dtos.response.CategoryResponse;
import com.deep.billingsoftware.entity.Category;
import com.deep.billingsoftware.repository.CategoryRepository;
import com.deep.billingsoftware.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryResponse saveCategory(CategoryRequest request) {

        Category newCategory = convertToCategory(request);
        newCategory = categoryRepository.save(newCategory);
        return convertToCategoryResponse(newCategory);

    }


    private Category convertToCategory(CategoryRequest request){
        return Category.builder()
                .categoryId(UUID.randomUUID().toString())
                .categoryName(request.getCategoryName())
                .bgColor(request.getBgColor())
                .description(request.getDescription())
                .build();
    }

    private CategoryResponse convertToCategoryResponse(Category category){
        return CategoryResponse.builder()
                .id(category.getId())
                .categoryId(category.getCategoryId())
                .categoryName(category.getCategoryName())
                .imgUrl(category.getImgUrl())
                .bgColor(category.getBgColor())
                .description(category.getDescription())
                .createdAt(category.getCreatedAt())
                .updatedAt(category.getUpdatedAt())
                .build();
    }
}
