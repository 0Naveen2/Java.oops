package Inheritance;

public class AllInOne {
    public static void main(String[] args) {
        System.out.println("***** Single level ******");
        NextLevel son = new NextLevel();
        System.out.println(son.name + " " + son.Surname);// single level inheritance

        System.out.println("***** Multi level ******");
        NextToNextlevel grandSon = new NextToNextlevel();
        System.out.println(grandSon.name + " " + grandSon.Surname);
    }
}
