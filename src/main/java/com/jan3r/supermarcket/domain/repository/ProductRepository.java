package com.jan3r.supermarcket.domain.repository;

import com.jan3r.supermarcket.domain.data.Product;


import java.util.List;
import java.util.Optional;

public interface ProductRepository {
     List<Product> getAll ();
     Optional<List<Product>> getOrderByNameAsc (int idCategory);
     Optional<List<Product>> getRunOutProducts (int stock);
     Optional<Product> getProduct(int productId);
     Product save(Product product);
     void delete(int productId);
}
