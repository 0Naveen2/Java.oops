package Encapsulation;

public class NormalClass {
    String name = "Naveen Kumar";
    int salary = 234567890;
    int bonus = (salary / 50) * 10;

    int income() {
        return salary + bonus;
    }
}
