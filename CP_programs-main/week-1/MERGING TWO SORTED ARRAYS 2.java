import java.util.Scanner;

class MergingTwoSortedArrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] arr2 = new int[b];
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] res = new int[a + b];
        int i = 0, j = 0, k = 0;
        while (i < a && j < b) {
            if (arr1[i] <= arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }

        while (i < a) res[k++] = arr1[i++];
        while (j < b) res[k++] = arr2[j++];

        for (int idx = 0; idx < res.length; idx++) {
            System.out.print(res[idx]);
            if (idx < res.length - 1) System.out.print(" ");
        }
    }
}
