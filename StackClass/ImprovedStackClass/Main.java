package com.company;

public class Main {

    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

        // push some numbers onto the stack
        for(int i=0; i<5; i++) myStack1.push(i);
        for(int i=0; i<8; i++) myStack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in myStack1: ");
        for (int i = 0; i<5; i++)
            System.out.println(myStack1.pop());

        // pop those numbers off the stack
        System.out.println("Stack in myStack2: ");
        for (int i = 0; i<8; i++)
            System.out.println(myStack2.pop());
    }
}
