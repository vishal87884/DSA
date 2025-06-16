package Searching;

public class CountSquare {
    public static void main(String[] args) {
        int res=find(9);
        System.out.println(res);
    }

    private static int find(int n) {
     int res=1; 
     while ((res*res)<n) {
       res++; 
     }
     return res-1;
    }
}
