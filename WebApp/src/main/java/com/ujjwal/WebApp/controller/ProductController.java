package com.ujjwal.WebApp.controller;
import java.util.List;
import com.ujjwal.WebApp.model.Product;
import com.ujjwal.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProduct(){
return service.getProduct();
    }
    public Product getProductId(int prodId){
        return service.getProductById(prodId);
    }
}
