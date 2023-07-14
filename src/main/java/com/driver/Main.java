package com.driver;

//import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;


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
        p.product(5,10);
        p.product(5,10,5);
        p.product(5.2,10.2);




    }
    //product class
    //final commit




}