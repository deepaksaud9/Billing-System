package com.deep.billingsoftware.entity;

import com.deep.billingsoftware.dtos.auditing.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_category")
public class Category extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String categoryId;
    @Column(unique = true)
    private String categoryName;
    private String description;
    private String bgColor;
    private String imgUrl;

/*    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;*/
}
