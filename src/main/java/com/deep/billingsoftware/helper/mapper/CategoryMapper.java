package com.deep.billingsoftware.helper.mapper;

import com.deep.billingsoftware.dtos.request.CategoryRequest;
import com.deep.billingsoftware.entity.Category;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class CategoryMapper {


    public Category convertToCategory(CategoryRequest request){

        Category category = Category.builder()
                .categoryName(request.getCategoryName())
                .description(request.getDescription())
                .bgColor(request.getBgColor())
                .build();
    }
}
