package com.jan3r.supermarcket.persistence.crud;

import com.jan3r.supermarcket.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepositoy extends CrudRepository<ProductEntity, Integer> {
    //Query Methods native
    @Query(value="SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true)
    List<ProductEntity> findProductByCategory(int idCategory);

    //Nueva forma
    List<ProductEntity> findByIdCategoryOrderByNameAsc(int idCategory);

    Optional<List<ProductEntity>> findByStockLessThanAndStatus(int stock, boolean status);


}
