package com.examples.section2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double avg;
        avg = (num1+num2+num3)/3.0;
        System.out.println("The average is "+avg);
    }
}
