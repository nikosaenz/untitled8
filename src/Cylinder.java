//demo
import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the base: ");
        double radius = input.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        double pi = 3.1416;

        double baseArea = pi * radius * radius;
        double volume = baseArea * length;

        System.out.printf("Base Area: %.4f\n", baseArea);
        System.out.printf("Volume: %.4f\n", volume);
    }
}

