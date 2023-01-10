package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);


            System.out.println("I will calculate the area of a circle for you!");
            System.out.println("Please enter the radius of the circle: ");

           double radius = (input.nextDouble());
           while (radius<=0){
               System.out.println("ERROR: PLEASE ENTER A NON-ZERO NON-NEGATIVE NUMBER");
               radius = (input.nextDouble());
           }

        double area =  Circle.getArea(radius);
        System.out.println("The area of that circle is: " + area);
    }
}
