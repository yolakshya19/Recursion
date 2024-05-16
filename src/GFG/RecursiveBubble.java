package GFG;
//Recursive Bubble sort

import java.util.Arrays;

public class RecursiveBubble {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        bubbleRecursive(arr,arr.length,1);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleRecursive(int[] arr, int length, int steps) {
        if (length == 1) {
            System.out.println(steps);
            return;
        }

        int count=0;
        for (int i = 0; i < length-1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count+=1;
            }
        }
        // if no swaps are made in a pass then we can stop the recursion early because array is already sorted
        // this helps in making the code efficient
        if(count==0){
            System.out.println(steps);
            return;
        }
        bubbleRecursive(arr,length-1,steps+1);
    }
}
