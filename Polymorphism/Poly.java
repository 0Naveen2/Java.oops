package Polymorphism;

public class Poly {
    public static void main(String[] args) {
        System.out.println("**** Overloding*****");
        Calculator cal = new Calculator();
        System.out.println(cal.add(1, 2));
        System.out.println(cal.add(1.5, 4.5));
        System.out.println(cal.add(1, 3, 2));
        System.out.println();

        System.out.println("**** Overriding*****");
        Animal a; // Referance of Animal
        a = new Dog(); // even though "a" is a type of animal, java see that it's actually a dog.
        a.Sound(); // dog barks

        System.out.println("    **Second Method**");
        Animal d = new Dog(); // both are same and aslo give the same output
        d.Sound();// dog barks

    }
}
