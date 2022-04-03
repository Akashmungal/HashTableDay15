package com.bridgelabz;

public class Main {



    public static void main(String[] args) {
        HashFunct func = new HashFunct("Paranoids are not paranoid because they are " +
                                        "paranoid but because they keep putting themselves deliberately " +
                                         "into paranoid avoidable situation",4);
        func.deleteData("Paranoids");
        func.showTable();

    }
}