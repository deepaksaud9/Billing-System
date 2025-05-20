package com.deep.billingsoftware.service;

import com.deep.billingsoftware.dtos.request.CategoryRequest;
import com.deep.billingsoftware.dtos.response.CategoryResponse;

public interface CategoryService {

    CategoryResponse saveCategory(CategoryRequest request);
}
