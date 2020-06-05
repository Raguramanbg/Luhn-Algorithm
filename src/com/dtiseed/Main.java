package com.dtiseed;

public class Main {

    public static void main(String[] args) {

        CheckValues checkValues = new ValueChecker();
        boolean value = checkValues.checkValue("4242424242424242");
        System.out.println(value);
    }

}
