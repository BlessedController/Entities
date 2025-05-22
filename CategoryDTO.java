package com.security.jwt.models.dtos;

import jakarta.validation.constraints.NotEmpty;

public class CategoryDTO {
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    @NotEmpty
    private String image;

    public CategoryDTO() {
    }

    public CategoryDTO(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
