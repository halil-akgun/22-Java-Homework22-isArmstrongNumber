package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int tempNum = num;
        int digit = 0;
        int value = 0;
        int valuePower = 1;
        int result = 0;


        //252
        while (tempNum != 0) {
            digit++;
            tempNum /= 10;
        }


        tempNum = num;

        for (int i = 0; i < digit; i++) {
            value = tempNum % 10;
            tempNum /= 10;
            valuePower = value;
            for (int k = 1; k < digit; k++) {
                valuePower *= value;
            }
            result += valuePower;
        }

        // System.out.println("result = " + result);

        if (num == result) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is not an Armstrong Number.");
        }


    }
}