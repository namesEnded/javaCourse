import java.util.Scanner;

//Дано число, необходимо вывести два числа через пробел. Первое число - количество нечетных цифр данного числа, второе число - произведение четных цифр данного числа.
// Если четных цифр в числе нет - произведение 0.
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
