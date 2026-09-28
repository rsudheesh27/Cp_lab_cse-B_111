import java.io.*;
import java.util.*;

public class counting-set-bits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        while(n>0){
            c += (n&1);
            n>>=1;
        }
        System.out.print(c);
    }
}

