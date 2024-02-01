package com.jan3r.supermarcket.persistence.Repository;

import com.jan3r.supermarcket.domain.data.Product;
import com.jan3r.supermarcket.persistence.crud.ProductCrudRepositoy;
import com.jan3r.supermarcket.persistence.entity.ProductEntity;
import com.jan3r.supermarcket.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;
@Repository
public class ProductRepository implements com.jan3r.supermarcket.domain.repository.ProductRepository {
    @Autowired
    private ProductCrudRepositoy productCrudRepository;
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> getAll (){
        List<ProductEntity> productEntities = (List<ProductEntity>) productCrudRepository.findAll();
        return productMapper.toProducts(productEntities);
    }
    @Override
    public Optional<List<Product>> getOrderByNameAsc (int idCategory){
        List<ProductEntity> productEntities = productCrudRepository.findByIdCategoryOrderByNameAsc(idCategory);
        return Optional.of( productMapper.toProducts(productEntities));
    }
    @Override
    public Optional<List<Product>> getRunOutProducts (int stock){
        Optional<List<ProductEntity>>  productEntities= productCrudRepository.findByStockLessThanAndStatus (stock, true);
        return productEntities.map(prod -> productMapper.toProducts(prod));
    }
    @Override
    public Optional<Product> getProduct(int productId) {
        return productCrudRepository.findById(productId).map(prod -> productMapper.toProduct(prod));
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = productMapper.toProductEntity(product);
        return productMapper.toProduct(productCrudRepository.save(productEntity));
    }

    @Override
    public void delete(int productId) {
        productCrudRepository.deleteById( productId );
    }

}
