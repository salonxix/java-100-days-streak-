import java.util.Scanner;

public class StarMountainPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the mountain: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print left side of the mountain
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print right side of the mountain
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
