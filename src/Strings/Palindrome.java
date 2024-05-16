package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ababababababababababababababababababababababbaba";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        if(str.length() == 0 || str.length() == 1) {
            return true;
        }

        if(isSame(str)){
            return isPalindrome(str.substring(1, str.length()-1));
        }

        return false;
    }

    private static boolean isSame(String str) {
        return str.charAt(0) == str.charAt(str.length()-1);
    }
}
