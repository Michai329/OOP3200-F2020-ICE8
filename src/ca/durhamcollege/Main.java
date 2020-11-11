/*
 * Author: Michai Pryce
 * Date: November 11, 2020
 */

package ca.durhamcollege;

import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        // Define our Scanner
        Scanner keyboard = new Scanner(System.in);

        // Input
        String name = "";
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();

        // Output
        System.out.printf("You Entered: %S \n",name);
        System.out.printf("You Entered: %,f \n",age);
    }
}
