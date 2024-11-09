package com.driver;

// Task 1: Create class A with a method named meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B which extends class A
class B extends A {
    // Task 4: Override method meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Main class to execute the tasks
public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A
        B obj = new B();
        
        // Calling the overridden method from class B
        System.out.println(obj.meth()); // This will call the overridden method in class B
    }
}
