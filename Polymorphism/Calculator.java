package Polymorphism;

// Compile time/ method Overloading
public class Calculator {
    int add(int a, int b) {// method with 2 int parameter.
        return a + b;
    }

    int add(int a, int b, int c) {// method with 3 int parameter.
        return a + b + c;
    }

    double add(double a, double b) {// method with 2 double parameter.
        return a + b;
    }
}
