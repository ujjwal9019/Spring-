package com.ujjwal.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Destop implements  Computer{
    public void compile(){
        System.out.println("This is Destop class");
    }
}
