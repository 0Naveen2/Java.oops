package Encapsulation;

public class Employee {
    private String name;
    private int ph;
    private int salary = 234567890;
    private int empId = 2;
    int bonus = (salary / 50) * 10;

    private int income() {
        return salary + bonus;
    }

    // now here come the role of getter and setter for accessing this values and
    // also of any updation. Because you cannot acces the private variable outside
    // the class.
    // "Getter && Settter"

    // setter
    void setPh(int phone) {
        ph = phone;
    }

    void setName(String name) {
        this.name = name;
    }

    // getter
    int getEmpId() {
        return empId;
    }

    int getIncome() {
        return income();
    }

    int getPh() {
        return ph;
    }

    String getName() {
        return name;
    }
}