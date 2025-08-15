package Polymorphism;

// Run time/ Method overriding
class Animal {
    void Sound() {
        System.out.println("Animal makes sounds");
    }
}

class Dog extends Animal {
    void Sound() {// overriding sound method.
        System.out.println("Dog barks");
    }

    void Legs() {
        System.out.println("Have 4 legs");
    }
}
