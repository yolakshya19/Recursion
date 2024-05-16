package Strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutations("","abc");
        System.out.println(permutationList("","abc"));;
        System.out.println(permutationCount("","abcd",0));
    }

    static void permutations(String p , String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutations(f + ch + s,up.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p ,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(permutationList(f + ch + s,up.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String p, String up, int count){
        if(up.isEmpty()){
            return count+1;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            count = permutationCount(f + ch + s,up.substring(1),count);
        }
        return count;
    }
}
