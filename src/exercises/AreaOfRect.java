package exercises;
import java.util.Scanner;
public class AreaOfRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the width of your rectangle in feet?");
        double width = input.nextDouble();
        System.out.println("What is the length of your rectangle in feet?");
        double length = input.nextDouble();
        double area = width * length;
        System.out.println("The area of your rectangle is " + area + " feet squared");
    }
}
