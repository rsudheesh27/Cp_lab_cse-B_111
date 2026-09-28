import java.io.*;
import java.util.*;

public class toggle-the-kth-bit-2-1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        
        System.out.print(n^(1<<k));
    }
}

