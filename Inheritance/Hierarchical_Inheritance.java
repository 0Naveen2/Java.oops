package Inheritance;

class PapaJi {
    String name = "Father's Name";
    String Surname = "Father's Surname";
    int Property = 200000;
}

class Self extends PapaJi {
    String name = "Naveen";
}

class Bhai extends PapaJi {
    String name = "Bhai";
}
