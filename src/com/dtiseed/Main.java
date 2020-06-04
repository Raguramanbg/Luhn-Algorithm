package com.dtiseed;

public class Main {

    public static void main(String[] args) {

        CheckValues checkValues = new ValueChecker();
        boolean value = checkValues.checkValue("5081598057040309");
        System.out.println(value);
    }

}
