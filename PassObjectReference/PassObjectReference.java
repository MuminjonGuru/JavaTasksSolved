package com.company;

public class PassObjectReference {

    public static void main(String[] args) {

        Test obj = new Test(15, 20);

        System.out.println("obj.a and obj.b before call: " + obj.a + " " + obj.b);

        obj.meth(obj);

        System.out.println("obj.a and obj.b after call: " + obj.a + " " + obj.b);
    }
}
