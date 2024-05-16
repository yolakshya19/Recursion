package GFG;

//Geek created a random series and given a name geek-onacci series.
// Given four integers A, B, C, N. A, B, C represents the first three numbers of geek-onacci series.
// Find the Nth number of the series. The nth number of geek-onacci series is a sum of the last three numbers (summation of N-1th, N-2th, and N-3th geek-onacci numbers)
//Input:
//1. The first line of the input contains a single integer T denoting the number of test cases.
// The description of T test cases follows.
//2. The first line of each test case contains four space-separated integers A, B, C, and N.
//
//Output: For each test case, print Nth geek-onacci number


public class GeekonacciNum {
    public static void main(String[] args) {
        int ans = geekonacci(6,1,3,2);
        System.out.println(ans);
    }
    static int geekonacci(int n,int a,int b,int c) {
        if(n==1){
            return a;
        }
        if(n==2){
            return b;
        }
        if(n==3){
            return c;
        }
        return geekonacci(n-1,a,b,c) + geekonacci(n-2,a,b,c) + geekonacci(n-3,a,b,c);
    }
}
