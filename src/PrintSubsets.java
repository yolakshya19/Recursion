import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {
    public static void main(String[] args) {
        int[] arr = {1,2};
        List<List<Integer>> result = subset(arr);
        for(List<Integer> list : result){
            System.out.println(list);
        }
        System.out.println();
        int[] arr1 = {1,2,2};
        List<List<Integer>> result1 = subsetDuplicate(arr1);
        for(List<Integer> list : result1){
            System.out.println(list);
        }
    }

    private static List<List<Integer>> subsetDuplicate(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){

            // if there is a duplicate element then we only need to add it into the newly made subsets in previous cycle
            // also the duplicate element should be adjacent to each other only then we will be able to recognise the duplicates

            if(i>0 && arr[i]==arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n= outer.size();
            for(int j=start;j<n;j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n= outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
