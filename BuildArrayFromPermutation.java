import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (distinct integers from 0 to " + (n - 1) + "):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        
        System.out.print("Resulting array: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
