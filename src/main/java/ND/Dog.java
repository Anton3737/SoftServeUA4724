package ND;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dog extends Animal {
    String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        try {
            int n = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Divide by 0");
        } finally {
            System.out.println("The end");
        }
    }

}
