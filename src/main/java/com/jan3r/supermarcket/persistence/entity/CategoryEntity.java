package com.jan3r.supermarcket.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categorias")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer id;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "estado")
    private Boolean status;

    @OneToMany(mappedBy = "category")
    private List<ProductEntity> products;

}