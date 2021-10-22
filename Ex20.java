import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int i = 0;
        while (i < n) {
            ar[i] = sc.nextInt();
            i++;
        }
        int counter = 0;
        for (int j = 0; j < ar.length; j++) {
            if (j != n - 1) {
                if (ar[j] > ar[j + 1]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
