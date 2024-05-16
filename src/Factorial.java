public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        factorialParameterized(n,1);
        System.out.println(factorialFunctional(n));
    }

    private static int factorialFunctional(int n) {
        if(n==1 || n==0){
            return 1;
        }
        return n * factorialFunctional(n-1);
    }

    private static void factorialParameterized(int n, int prod) {
        if(n==0){
            System.out.println(prod);
            return;
        }

        factorialParameterized(n-1, prod*n);
    }
}
