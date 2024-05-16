package BackTracking;
// print all the possible paths
// return all the paths in ARRAYLIST

import java.util.ArrayList;

public class MazePrint {
    public static void main(String[] args) {
        path("",3,3);
        System.out.println(pathRet("",3,3));;
        System.out.println(pathRetDiagonal("",3,3));
    }

    private static void path(String p, int r, int c) {
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+"D",r-1,c);
        }
        if(c>1){
            path(p+"R",r,c-1);
        }
    }

    private static ArrayList<String> pathRet(String p, int r, int c) {
        if(r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(p+"R",r,c-1));
        }
        return list;
    }

    private static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if(r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathRetDiagonal(p+"d",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathRetDiagonal(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(pathRetDiagonal(p+"R",r,c-1));
        }
        return list;
    }
}
