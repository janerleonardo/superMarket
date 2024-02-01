package com.jan3r.supermarcket.domain.data;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Product {
    private Integer id;
    private String name;
    private Integer idCategory;
    private BigDecimal salePrice;
    private Integer stock;
    private Boolean active;
    private Category category;
}
