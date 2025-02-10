import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculating circumference
        double circumference = 2 * Math.PI * radius;

        // Displaying result
        System.out.println("The circumference of the circle is: " + circumference);

        scanner.close();
    }
}
