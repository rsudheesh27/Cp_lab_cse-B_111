import java.io.*;
import java.util.*;

public class Solution {

    public static int maxAscendingSum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentSum += arr[i];
            } else {
                currentSum = arr[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        if (!obj.hasNextInt()) return;
        
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        
        System.out.print(maxAscendingSum(arr));
    }
}
