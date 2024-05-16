package Strings;

public class RemovingA {
    public static void main(String[] args) {
        System.out.println(removeA("baccadadadygacad",""));
    }
    public static String removeA(String s, String ans){
        if(s.isEmpty()){
            return ans;
        }

        char ch = s.charAt(0);
        if(ch == 'a'){
            return removeA(s.substring(1),ans);
        }
        else{
            return removeA(s.substring(1),ans + ch);
        }
    }
}
