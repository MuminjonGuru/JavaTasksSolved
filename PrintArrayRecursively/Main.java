package com.company;

public class Main {

    public static void main(String[] args) {
	    RecTest obj = new RecTest(10);
	    int i;

	    for(i=0; i<10; i++) obj.values[i] = i;

	    obj.printArray(10);

    }
}
