package Recursion;

import pattern.fib;

public class fibnocii {

    public static void fib(int a, int b, int n) {
        if (n <= 0) {
            return;
        }
        int nextNum=a+b;
        System.out.print(nextNum+" ");
         fib(b, nextNum, n-1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1, n=8;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fib(a, b, n );
    }

}
