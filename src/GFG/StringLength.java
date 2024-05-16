package GFG;
//Given a string calculate length of the string using recursion.
//
//Examples:
//
//Input : str = "abcd"
//Output :4
//
//Input : str = "GEEKSFORGEEKS"
//Output :13


public class StringLength {
    public static void main(String[] args) {
        String str = "Lakshya";
        lengthFind(str,0);
        System.out.println(lengthFindRet(str,0));;
    }

    static void lengthFind(String str, int length) {
        if(str.isEmpty()){
            System.out.println(length);
            return;
        }
        lengthFind(str.substring(1), length + 1);
    }

    static int lengthFindRet(String str, int length) {
        if (str.isEmpty()) {
            return length;
        }
        return lengthFindRet(str.substring(1), length + 1);
    }
}
