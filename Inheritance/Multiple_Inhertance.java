package Inheritance;

/*public class Multiple_Inhertance { 
    
    Multiple inheritance is not possible in java , due to diomand problem(means Confusion) to acchive multiple inheritance in java we use interface .
    
}*/

interface Mother {
    void name();
}

interface Father {
    void SurName();
}

class Me implements Mother, Father {

    @Override
    public void SurName() {
        System.out.println("Kumar"); // Changed to println
    }

    @Override
    public void name() {
        System.out.print("Naveen ");
    }
}
