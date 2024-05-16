public class PrintN {
    public static void main(String[] args) {
        int n = 5;
        printN(1,5);
        System.out.println();
        printNrev(1,5);
    }

    private static void printNrev(int i, int n) {
        if (i == n+1) {
            return;
        }
        printNrev(i+1, n);
        System.out.print(i+" ");
    }

    static void printN(int i, int n){
        if(i == n+1){
            return;
        }

        System.out.print(i + " ");
        printN(i+1, n);
    }
}
