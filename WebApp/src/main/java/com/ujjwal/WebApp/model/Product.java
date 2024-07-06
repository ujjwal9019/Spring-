package com.ujjwal.WebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component
public class Product {

    private int prodId;
    private String prodName;
    private int price ;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public Product(){

    }

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.price = price;
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
