package com.ujjwal.WebApp.service;

import com.ujjwal.WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101 , "Iphone" , 5000),
            new Product(102,"Canon ",7000),
     new Product(103 , "Mic " , 20000));

    public  List<Product> getProduct(){
        return  products;
    }
}
