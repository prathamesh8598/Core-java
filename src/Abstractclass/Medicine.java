package Abstractclass;

import java.util.Scanner;

public class Medicine {
    String name;
    String address;

    public Medicine(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displaylabel(){
        System.out.println("Name is :"+name);
        System.out.println("Address is :"+address);
    }
}
