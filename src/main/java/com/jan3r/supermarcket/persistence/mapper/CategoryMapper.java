package com.jan3r.supermarcket.persistence.mapper;

import com.jan3r.supermarcket.domain.data.Category;
import com.jan3r.supermarcket.persistence.entity.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
                @Mapping( source ="id", target="id"),
                @Mapping( source ="description", target="category"),
                @Mapping( source ="status", target="active")
            })
    Category toCategory(CategoryEntity categoryEntity);
    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    CategoryEntity toCategoryEntity(Category category);
}
