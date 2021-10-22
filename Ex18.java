import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (int i =0 ; i<n+1; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
