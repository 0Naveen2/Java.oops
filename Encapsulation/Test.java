package Encapsulation;

public class Test {
    public static void main(String[] args) {
        NormalClass cls = new NormalClass();
        Employee emp = new Employee();
        System.out.println(cls.name);
        System.out.println(cls.income());
        System.out.println("****** Encapsulation *******");
        // getting the empId and Income.
        System.out.println(emp.getEmpId());
        System.out.println(emp.getIncome());
        // setting the name ans phone no.
        emp.setName("Naveen Kumar");
        emp.setPh(911000616);
        System.out.println(emp.getName());
        System.out.println(emp.getPh());
    }
}