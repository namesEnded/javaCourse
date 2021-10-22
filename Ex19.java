import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar= new int[n];
        int i = 0;
        while (i<n){
            ar[i]= sc.nextInt();
            i++;
        }
        boolean flagIs = false;
        for (int j =0; j<ar.length; j++){
            if(ar[j] > 9 && ar[j] < 100 && ar[j]%2==0){
                System.out.print(ar[j] + " ");
                flagIs = true;
            }
        }

        if ( flagIs == false){
            System.out.println(-1);
        }
    }
}
