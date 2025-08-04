package com.example.productcatalogms.Controllers;

import com.example.productcatalogms.Models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return null;
    }

    @GetMapping("/productById")
    public Product getProductById(Long id) {
        return null;
    }
}
