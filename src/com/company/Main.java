package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Imagine you are writing a program for a store. It should announce the promotion condition:
    // ” You can get the BestWowSomething by the price 89.99$. But if you buy two articles then
   // you get the discount 10% of all and if you bay three and more the discount will be 15% of all”.
   // Then It should asks the user how many articles user wants to buy. If the user input something more
   // than 0 the program should print the amount of purchase, else displays “It's a pity. See you next time”
        System.out.println("Item 1");
        System.out.println("You can get the BestWowSomething by the price 89.99$. But if you buy two articles then\n" +
                "   // you get the discount 10% of all and if you bay three and more the discount will be 15% of all ");

        double bestWowSomething = 89.99;

     Scanner sc= new Scanner(System.in);
        System.out.println("How many articles you want to buy? - ");
     int articles = sc.nextInt();

     if ( articles == 0) {
         System.out.println("It's a pity. See you next time");
     }
     if ( articles == 1 ) {
         System.out.println("Your price = " + ((bestWowSomething * articles) - (bestWowSomething * articles) /100*10) + " $");
     }
     if ( articles == 2 ) {
         System.out.println("Your price = " + ((bestWowSomething * articles) - (bestWowSomething * articles) /100*15) + " $");
        }
     if ( articles > 2 ) {
         System.out.println("Your price = " + ((bestWowSomething * articles) - (bestWowSomething * articles) /100*15) + " $");
     }

        //Implement the program that ask user to input three integers (use Scanner),
        // and print the maximum of three numbers. 19,10,1 -> 19
     System.out.println("Item 2");
        Scanner sc1= new Scanner(System.in);
        System.out.println("Give me any integer - ");
        int x = sc.nextInt();
        Scanner sc2= new Scanner(System.in);
        System.out.println("Give me any integer - ");
        int y = sc2.nextInt();
        Scanner sc3= new Scanner(System.in);
        System.out.println("Give me any integer - ");
        int z = sc3.nextInt();

if ( x >= y && x >= z ) {
    System.out.println("Max = " + x); }
if ( y >= x && y >= z ) {
    System.out.println("Max = " + y); }
if ( z >= y && z >= x ) {
    System.out.println( "Max = " + z); }



            // Implement the program that ask user to input the year, and print the is this year leap or no.
        System.out.println("Item 3");
                     Scanner sc4= new Scanner(System.in);
                     System.out.println("Give me any year  - ");
                     int year = sc4.nextInt();
                     boolean isLeap = false;

        if(year % 4 == 0)
        {
        if( year % 100 == 0)
            {
        if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
                else
                    isLeap = true;
            }
                else {
                    isLeap = false;
            }

        if(isLeap==true)
            System.out.println(year + " Is a Leap Year.");
        else
            System.out.println(year + " Is not a Leap Year.");





}
    }