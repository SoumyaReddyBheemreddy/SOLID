package com.examples.section2;

import java.util.Scanner;

public class MadLibClone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String adjective1;
        String girlName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;
        System.out.println("Enter an adjective\t");
        adjective1 = sc.nextLine();
        System.out.println("Enter a girl's name\t");
        girlName = sc.nextLine();
        System.out.println("Enter another adjective \t");
        adjective2 = sc.nextLine();
        System.out.println("Enter occupation\t");
        occupation1 = sc.nextLine();
        System.out.println("Enter the name of the place\t");
        placeName = sc.nextLine();
        System.out.println("Enter the name of a piece clothing\t");
        clothing = sc.nextLine();
        System.out.println("Enter name of the hobby\t");
        hobby = sc.nextLine();
        System.out.println("Enter another adjective\t");
        adjective3 = sc.nextLine();
        System.out.println("Enter another occupation\t");
        occupation2 = sc.nextLine();
        System.out.println("Enter boy's name\t");
        boysName = sc.nextLine();
        System.out.println("Enter man's name");
        mansName = sc.nextLine();
        System.out.println("There once was a "+adjective1+ "girl named "+girlName +
                " who was a "+adjective2+" " + occupation1+" in the kingdom of "+placeName );
        System.out.println("She loved to wear "+clothing+" and to "+hobby+". She wanted to marry the "+adjective3
                            +" "+occupation2+" named "+boysName+" but her father king "+mansName+" forbid her from seeing him");

    }
}
