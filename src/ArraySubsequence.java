import java.util.ArrayList;
import java.util.Arrays;

public class ArraySubsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        subseq(arr,0, new ArrayList<>());
    }
    private static void subseq(int[] arr, int i, ArrayList<Integer> list){
        if(i == arr.length){
            System.out.println(list);
            return;
        }

        // pick
        list.add(arr[i]);
        subseq(arr, i + 1, list);

        // not pick
        list.remove(list.size() - 1);
        subseq(arr, i + 1, list);
    }
}
