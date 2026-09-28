import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Counting_Sort_1 {
    public static void main(String[] args) throws IOException {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int[] arr = new int[n];
    for(int i =0; i<n ;i++) arr[i] = obj.nextInt(); 
    
    int[] res = new int[100];
    for(int i = 0 ;i<n;i++) res[arr[i]]++;
    
    for(int i = 0 ;i<100;i++) System.out.print(res[i] + " ");
    }
}


