package com.security.jwt.models.dtos;

import com.security.jwt.models.Category;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class ProductDTO {

    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    @NotNull
    private Double price;
    @NotEmpty
    private String image;
    @NotNull
    private List<Long> categoryIds;

    public ProductDTO() {
    }

    public ProductDTO(String name, String description, Double price, String image, List<Long> categoryIds) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.categoryIds = categoryIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Long> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryId(List<Long> categoryId) {
        this.categoryIds = categoryId;
    }
}
