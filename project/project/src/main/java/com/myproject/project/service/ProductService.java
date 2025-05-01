package com.myproject.project.service;


import com.myproject.project.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> getAllProducts(Pageable pageable);
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
