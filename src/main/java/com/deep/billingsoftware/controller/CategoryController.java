package com.deep.billingsoftware.controller;

import com.deep.billingsoftware.dtos.request.CategoryRequest;
import com.deep.billingsoftware.dtos.response.CategoryResponse;
import com.deep.billingsoftware.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping(value = "/create")
    public ResponseEntity<CategoryResponse> saveCategory(@Valid @RequestBody CategoryRequest request){

        return new ResponseEntity<>(categoryService.saveCategory(request), HttpStatus.OK);
    }


}
