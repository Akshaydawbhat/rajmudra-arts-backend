package com.rajmudraarts.backend.controller;

import com.rajmudraarts.backend.model.Product;
import com.rajmudraarts.backend.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.createProduct(product);
    }

    // READ ALL
    @GetMapping
    public List<Product> getAll() {
        return service.getAllProducts();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Product getOne(@PathVariable Long id) {
        return service.getProductById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id,
                          @RequestBody Product product) {
        return service.updateProduct(id, product);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteProduct(id);
        return "Product deleted successfully";
    }
}