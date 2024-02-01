package com.jan3r.supermarcket.persistence.mapper;

import com.jan3r.supermarcket.domain.data.Product;
import com.jan3r.supermarcket.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel="spring", uses = CategoryMapper.class)
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "idCategory", target = "idCategory"),
            @Mapping(source = "salePrice", target = "salePrice"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(source = "status", target = "active"),
            @Mapping(source = "category", target = "category"),
    })
    Product toProduct(ProductEntity productEntity);

    List<Product> toProducts(List<ProductEntity> productEntities);
    @InheritInverseConfiguration
    @Mapping(target ="barCode", ignore = true)
    ProductEntity toProductEntity(Product product);
}
