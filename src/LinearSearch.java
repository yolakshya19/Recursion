public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 6,0, 8};
        System.out.println(Linear(arr,0,0));
    }

    private static int Linear(int[] arr, int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return Linear(arr,target,i+1);
    }
}
