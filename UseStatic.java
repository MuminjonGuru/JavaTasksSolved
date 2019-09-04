package com.company;

public class UseStatic {

    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
	    meth(42);
    }
}


/*
  The most common example of a static member is main(). main() is declared as static because it must be
  called before any objects exist.
*/
