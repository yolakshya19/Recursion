package Strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(pad("","12",new ArrayList<>()));
    }

    static ArrayList<String> pad(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char) ('a' + i);
            pad(p + ch,up.substring(1),list);
        }
        return list;
    }
}
