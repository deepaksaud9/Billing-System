package com.deep.billingsoftware.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponse {

    private Long id;
    private String categoryId;
    private String categoryName;
    private String description;
    private String bgColor;
    private String imgUrl;

    private LocalDateTime createdAt;
    private String updatedAt;
}
