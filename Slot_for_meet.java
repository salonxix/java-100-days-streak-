import java.util.*;
import java.io.*;

class Solution {
    public int[] commonSlot(int[][] slt1, int[][] slt2, int d) {
     
        Arrays.sort(slt1, (x, y) -> Integer.compare(x[0], y[0]));
        Arrays.sort(slt2, (x, y) -> Integer.compare(x[0], y[0]));
        
        int p1 = 0, p2 = 0;
        while (p1 < slt1.length && p2 < slt2.length) {
         
            int left = Math.max(slt1[p1][0], slt2[p2][0]);
            int right = Math.min(slt1[p1][1], slt2[p2][1]);
            if (right - left >= d) {
                return new int[]{left, left + d};
            }
         
            if (slt1[p1][1] < slt2[p2][1])
                p1++;
            else
                p2++;
        }
      
        return new int[0]; 
    }
}

public class Slot_for_meet {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter number of slots for first person: ");
        int n1 = sc.nextInt();
        int[][] slt1 = new int[n1][2];
        System.out.println("Enter the slots (start end):");
        for (int i = 0; i < n1; i++) {
            slt1[i][0] = sc.nextInt();
            slt1[i][1] = sc.nextInt();
        }
        
     
        System.out.print("Enter number of slots for second person: ");
        int n2 = sc.nextInt();
        int[][] slt2 = new int[n2][2];
        System.out.println("Enter the slots (start end):");
        for (int i = 0; i < n2; i++) {
            slt2[i][0] = sc.nextInt();
            slt2[i][1] = sc.nextInt();
        }
        
   
        System.out.print("Enter required duration: ");
        int d = sc.nextInt();
        
        Solution sol = new Solution();
        int[] result = sol.commonSlot(slt1, slt2, d);
        
        if (result.length == 0)
            System.out.println("[]");
        else
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        
        sc.close();
    }
}
