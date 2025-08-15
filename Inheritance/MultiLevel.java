package Inheritance;

class MultiLevel {
    String name = "Naveen";
    String Surname = "Kumar";
}

class MultiNextLevel extends MultiLevel {
    String name = "Byass";
}

class MultiNextToNextLevel extends MultiNextLevel {
    String name = "Rohit";
}
