package Inheritance;

public class AllInOne {
    public static void main(String[] args) {

        System.out.println("***** Single Level ******");
        SingleNextLevel son = new SingleNextLevel();
        System.out.println(son.name + " " + son.SurName); // single-level inheritance

        System.out.println();

        System.out.println("***** Multi Level ******");
        MultiNextToNextLevel grandSon = new MultiNextToNextLevel();
        System.out.println(grandSon.name + " " + grandSon.Surname);

        System.out.println();

        System.out.println("***** Multiple inheritance using Interface *****");
        Me me = new Me();
        me.name();
        me.SurName();

        System.out.println();

        System.out.println("**** Hierarchical Inheritance ****");
        Self ham = new Self();
        Bhai bhai = new Bhai();
        System.out.println(ham.Property);
        System.out.println(bhai.Property);
    }
}
