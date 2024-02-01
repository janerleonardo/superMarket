package com.jan3r.supermarcket.web.controller;

import com.jan3r.supermarcket.domain.data.Product;
import com.jan3r.supermarcket.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProduct (@PathVariable("id") int producId){
        return productService.getProduct(producId);
    }

    @GetMapping("/category/{id}")
    public Optional<List<Product>> getOrderByNameAsc (@PathVariable("categoryId") int idCategory){
        return productService.getOrderByNameAsc(idCategory);
    }
    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int productId) {
        return getProduct(productId).map(product -> {productService.delete(productId); return  true;}).orElse(false);
    }
}
