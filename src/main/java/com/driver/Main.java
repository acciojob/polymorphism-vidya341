package com.driver;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;


public class Main {
    public static class Product {
        //constructor
        //final commit
        public int product(int x,int y)
        {
            return x*y;
        }
        public int product(int x,int y,int z)
        {
            return x*y*z;
        }
        public double product(double x,double y)
        {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int a = p.product(5,10);
        int b = p.product(5,10,5);
        double c = p.product(5.2,10.2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    //product class
    //final commit




}