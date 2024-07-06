package com.ujjwal.WebApp.service;

import com.ujjwal.WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101 , "Iphone" , 5000),
            new Product(102,"Canon ",7000),
     new Product(103 , "Mic " , 20000)));

    public  List<Product> getProduct(){
        return  products;
    }

//    This function is to get the product by its id
    public Product getProductById(int prodId){
    return products.stream().filter(p -> p.getProdId() == prodId)
            .findFirst()
            .get();
    }


    public void addProduct(Product prod){
        products.add(prod);
    }
    public void updateProduct(Product prod){
        int index = 0;
        for (int i = 0; i <products.size() ; i++) {
        if(products.get(i).getProdId() == prod.getProdId()){
            index = i;
            products.set(index,prod);
        }
        }
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
                products.remove(index);
            }


        }
    }

}
