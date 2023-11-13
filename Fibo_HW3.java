package com.telran.algorithms.hw;

public class Fibo_HW3 {

    static double FibonacciRecursion(int n) {
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        }
        return FibonacciIteration(n - 1) + FibonacciIteration(n - 2);
    }

    static double FibonacciIteration(int n) {
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= n; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(FibonacciIteration(10));
        System.out.println();
        System.out.println(FibonacciIteration(20));
        System.out.println();
        System.out.println(FibonacciIteration(30));
        System.out.println();
        System.out.print(FibonacciRecursion(10));
        System.out.println();
        System.out.print(FibonacciRecursion(20));
        System.out.println();
        System.out.print(FibonacciRecursion(30));
    }
}
