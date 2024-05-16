import java.util.Arrays;

public class SumTriangle {

    public static void main(String[] args) {
        long[] arr = {4, 7, 3, 6, 7};
        long n = arr.length;

        long[] result = getTriangle(arr, n);

        // Print the result
        System.out.println(Arrays.toString(result));
    }

    public static long[] getTriangle(long arr[], long n) {
        return helper(arr);
    }

    public static long[] helper(long arr[]) {
        // Base case: return the input array if it has only one element
        if(arr.length == 1) {
            return arr;
        }

        // Create an array to store the result
        long[] temp = new long[arr.length - 1];

        // Calculate sums of consecutive pairs
        for(int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }

        // Recursive call with the modified array
        long[] result = helper(temp);

        // Concatenate the result and the original array
        long[] triangle = new long[arr.length + result.length];
        System.arraycopy(result, 0, triangle, 0, result.length);
        System.arraycopy(arr, 0, triangle, result.length, arr.length);

        return triangle;
    }
}
