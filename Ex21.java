import java.util.Scanner;
import java.util.Arrays;
public class Ex21 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int i = 0;
        while (i < n) {
            ar[i] = sc.nextInt();
            i++;
        }
        int counter = 0;
        int buffCounter = counter;
        boolean flagDO = false;
//        System.out.println(Arrays.toString(ar));
        for (int j = 0; j < ar.length; j++) {
            if (j!= n-1) {
                if (ar[j] < ar[j + 1]) {
                    sb.append(ar[j] + " ");
                    counter++;
                    flagDO = true;
                }
            }
            if ((j!= 0) ){
                if (ar[j]>ar[j-1] && flagDO==false){
                    sb.append(ar[j] + " " + "+" + " ");
                    counter++;
                    if (buffCounter<counter){
                        buffCounter=counter;
                    }
                    counter = 0;
                    flagDO = true;
                }
            }
            flagDO = false;
            }
//        System.out.println(sb.toString());
        System.out.println(buffCounter);
        String[] arr = sb.toString().split(" ");
//        System.out.println(Arrays.toString(arr));
        for (int k = 0; k<arr.length; k++){
            if (arr[k].equals("+")){
                System.out.print("\n");continue;}
            else {
                System.out.print(arr[k] + " ");
            }

        }
    }
}
