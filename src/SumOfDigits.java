import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(sumdigits(num));
    }

    private static int sumdigits(int num) {
        if(num==0){
            return 0;
        }
        int digit = num % 10;
        return digit + sumdigits(num/10);
    }
}