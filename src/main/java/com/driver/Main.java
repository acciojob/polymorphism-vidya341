package com.driver;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    //product class
    //final commit
    Product p = new Product();
    int a = p.product(5,10);
    int b = p.product(5,10,5);
    double c = p.product(5.2,10.2);


}