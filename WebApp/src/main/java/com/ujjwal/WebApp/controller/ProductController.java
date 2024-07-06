package com.ujjwal.WebApp.controller;
import java.util.List;
import com.ujjwal.WebApp.model.Product;
import com.ujjwal.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @GetMapping ("/products")
    public List<Product> getProduct(){
return service.getProduct();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductId(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

//    This Method to add in List from client to server
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);

    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }


}
