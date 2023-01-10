package exercises;
import java.util.Scanner;
public class GasMileage {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you travelled");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas did your car use to drive those miles?");
        double gallons = input.nextDouble();
        System.out.println("Miles per gallon = " + gallons/miles);

    }
}
