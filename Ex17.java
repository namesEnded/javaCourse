import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] ar = n.split(" ");
        int len = ar.length;
        int min = Integer.parseInt(ar[0]);
        for (int i =0; i<len; i++){
            int bufInt = Integer.parseInt(ar[i]);
            if (bufInt<min) {min = bufInt;}
        }
        System.out.print (min);
    }
}
