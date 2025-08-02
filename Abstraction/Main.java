package Abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** ITERFACE *****");
        SBIread sbi = new SBIread();
        sbi.rdData();// SBI none of your bussiniss
        System.out.println("***** ABSTRACT *****");
        Admin admin = new Admin();
        admin.readData();// Naveen
    }
}
