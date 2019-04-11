/* Justin Lazarski
   CIS 3090.04
   4/10/19
   Homework2Question2
 */
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please Input a radius: ");
            double r = input.nextDouble();
            Circle c = new Circle(r);

            System.out.println("Area:" + c.getArea());
            System.out.println("Diameter: " + c.getDiameter());
            System.out.println("Circumference: " + c.getCircumference());
            System.out.println("\n");
            System.out.println("Would you like to input another radius? \n Press Y/N to continue.");
            String answer = "";
            answer = input.next();

            if (answer.equals("N")) {
                break;
            }
        }
    }
}
