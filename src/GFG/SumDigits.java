package GFG;

public class SumDigits {
    public static void main(String[] args) {
        int num = 45632;
        System.out.println(digitsSum(num));
    }

    private static int digitsSum(int num) {
        if(num==0){
            return 0;
        }
        return num%10 + digitsSum(num/10);
    }
}
