package com.company;


public class Main {

    public static void main(String[] args) {

    int number;
    int addition = 0;


        for (number =0; number < 1000; number++) {
            if (number % 3 == 0 || number % 5 == 0) {
                addition += number;
            }
        } System.out.println("The sum of all the multiples of 3 or 5 below 1000 is " + addition + "!");
    }
}
