package com.jan3r.supermarcket.domain.data;


import lombok.Data;

@Data
public class Category {
    private Integer id;
    private String category;
    private Boolean active;
}
