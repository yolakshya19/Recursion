package Strings;

public class StringLength {
    public static void main(String[] args) {
        String name = "Lakshya";
        System.out.println(FindLength(name));
    }
    public static int FindLength(String s){
        if(s.equals("")){
            return 0;
        }
        return FindLength(s.substring(1)) + 1;
    }
}

