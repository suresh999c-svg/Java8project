package com.suresh.demo;

public class functionalInterface {

    public static void main(String[] args) {

        // Lambda expression implementation
        MyFunctionalInterface obj = (name) -> {
            System.out.println("Hello " + name + "!");
        };

        obj.sayHello("Suresh");
    }
}
