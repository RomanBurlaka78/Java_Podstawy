package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
    public int subtraction(int a, int b) {
        return a-b;
    }
    public int multipli(int a, int b) {
        return a*b;
    }
    public int division(int a, int b) {
        if(b==0) {
            System.out.println("Nie wolno dzielic na 0");
        }
        return 0;
    }
}
