package com.jan3r.supermarcket.domain.service;

import com.jan3r.supermarcket.domain.data.Product;
import com.jan3r.supermarcket.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAll(){
      return productRepository.getAll();
  }

  public Optional<Product> getProduct (int producId){
      return productRepository.getProduct(producId);
  }

   public Optional<List<Product>> getOrderByNameAsc (int idCategory){
      return productRepository.getOrderByNameAsc(idCategory);
   }

   public Product save(Product product) {
      return productRepository.save(product);
   }
    public boolean delete(int productId) {
      return getProduct(productId).map(product -> {productRepository.delete(productId); return  true;}).orElse(false);
    }

}
