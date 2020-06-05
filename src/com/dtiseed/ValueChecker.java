package com.dtiseed;

//The following is an error check code algorithm:
//        From the rightmost digit, and moving left, double the value of every second digit.
//        If the result of this doubling is greater than 9, add the two digits together.
//        Sum all together.
//        If the total ends in zero, then the number is valid.
//        Luhn's Algorithm
//        4242424242424242
//        5242424242424243

public class ValueChecker implements CheckValues {
    @Override
    public boolean checkValue(String s) {
         int a,b;
         int sum=0;
         int value;
         if(s.length() == 16) {
             for (int i = s.length(); i > 0; i = i - 2) {
                 a = Character.getNumericValue(s.charAt(i - 1));
                 b = Character.getNumericValue(s.charAt(i - 2));
                 if (b * 2 > 9) {
                     int temp1;
                     int temp2;
                     b = b * 2;
                     temp1 = b / 10;
                     temp2 = b % 10;
                     b = temp1 + temp2;
                 } else {
                     b = b * 2;
                 }
                 value = a + b;
                 sum = value + sum;
             }
             return sum % 10 == 0;
         }
        return false;
    }
}

