package GFG;
// Remove all consecutive duplicates from the string using recursion:
//Approach:
//
//If the string is not empty compare the adjacent characters of the string.
// If they are the same then shift the characters one by one to the left.
// Call recursion on string S otherwise, call recursion from S+1 string.
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        System.out.println(remove(s1));
        String s2 = "aabcca";
        System.out.println(remove(s2));
    }

    private static String remove(String s1) {
        if(s1.length() < 2) return s1;

        if(s1.charAt(0) == s1.charAt(1)){
            return remove(s1.substring(1));
        }

        return s1.charAt(0) + remove(s1.substring(1));
    }
}
