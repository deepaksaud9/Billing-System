package com.deep.billingsoftware.service.serviceImpl;

import com.deep.billingsoftware.dtos.request.CategoryRequest;
import com.deep.billingsoftware.dtos.response.CategoryResponse;
import com.deep.billingsoftware.entity.Category;
import com.deep.billingsoftware.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    @Override
    public CategoryResponse saveCategory(CategoryRequest request) {

        Category category = Category.builder()
                .categoryName(request.getCategoryName())
                .bgColor(request.getBgColor())
                .description(request.getDescription())
                .build();

        return null;
    }
}
