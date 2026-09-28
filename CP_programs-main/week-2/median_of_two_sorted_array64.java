import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long n = obj.nextLong();
        long m = obj.nextLong();
        double s = 0;
        for (int i = 0; i < n; i++) {
            s += obj.nextDouble();
        }
        for (int j = 0; j < m; j++) {
            s += obj.nextDouble();
        }
        long total = n+m;
        
        if (total == 0) {
            System.out.print(0.0tere);
            return;
        }
        System.out.print( (s / total));
    }
}
