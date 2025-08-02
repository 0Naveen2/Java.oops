package Inheritance;

class MultiLevel {
    String name = "Naveen";
    String Surname = "Kumar";
}

class NextLevel extends MultiLevel {
    String name = " Byass";
}

class NextToNextlevel extends NextLevel {
    String name = "Rohit";
}
