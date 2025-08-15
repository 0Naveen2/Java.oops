package Abstraction;

// Abstraction can be achive in two way 1) using abstract keyword and 2) using interface keyword. In both the case you cannot create the object of it . 

// 1) Abstract method.
public abstract class Bank {
    String name;

    abstract void readData();

    abstract void writeData();

    void copyData() {
        /*
         * you can write all your inplementation in this and access it by making the
         * object of it but due to abstract keyword you cannot make the object of
         * abstract class and you can't access it.
         */
    }
}

class Admin extends Bank { /*
                            * now you can make the object of this admin class and give the access to the
                            * person that you want.
                            */
    void readData() {
        System.out.println("Naveen");
    }

    void writeData() {

    }
}

class Marketing extends Bank {
    @Override
    void readData() {

    }

    @Override
    void writeData() {

    }

}

// 2) Interface method
interface InnerBank {
    /*
     * void method(){
     * This will not work because in interface by default all the methods are
     * abstract method.
     * }
     */
    void rdData();

    void wtData(); // this is only for declaration you cannot implement anything here.
}

class SBIread implements InnerBank {
    @Override
    public void rdData() {// this is for the implementation .
        System.out.println("SBI none of your bussiniss");
    }

    @Override
    public void wtData() {
    }

}