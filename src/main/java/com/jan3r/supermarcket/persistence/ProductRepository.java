package com.jan3r.supermarcket.persistence;

import com.jan3r.supermarcket.persistence.crud.ProductCrudRepositoy;
import com.jan3r.supermarcket.persistence.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private ProductCrudRepositoy productCrudRepositoy;

    public List<ProductEntity> getAll (){
        return (List<ProductEntity>) productCrudRepositoy.findAll();
    }

    public List<ProductEntity> getOrderByNameAsc (int idCategory){
        return (List<ProductEntity>) productCrudRepositoy.findByIdCategoryOrderByNameAsc(idCategory);
    }

    public Optional<List<ProductEntity>> getLowesQuantity (int stock){
        return  productCrudRepositoy.findByStockLessThanAndStatus (stock, true);
    }
}
