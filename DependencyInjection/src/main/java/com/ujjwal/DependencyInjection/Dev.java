package com.ujjwal.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//So by this Anotaion we can inject its object to another class
@Component
public class Dev {
//    Feild Injection
    @Autowired
    Laptop laptop;

//    another way to inject is constructor inject
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

    //Setter Injection
//    @Autowired
//    public  void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        laptop.compile();
        System.out.println("This is an awsem project");
    }
}
