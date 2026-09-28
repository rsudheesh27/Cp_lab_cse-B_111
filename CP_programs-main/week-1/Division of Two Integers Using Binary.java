import java.util.*;

public class Division of Two Integers Using Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            System.out.println(Integer.MAX_VALUE);
        } else {
            System.out.println(dividend / divisor);
        }
    }
}
