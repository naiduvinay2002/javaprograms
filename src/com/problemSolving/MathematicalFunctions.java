package com.problemSolving;


import java.util.Scanner;

public class MathematicalFunctions {

    // Function to count the number of digits
    public static int countDigits(int n) {
        n = Math.abs(n);

        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Function to generate Fibonacci series
    public static void fibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Function to display prime numbers in a range
    public static void primeNumbers(int start, int end) {
        System.out.println("Prime Numbers:");

        for (int i = start; i <= end; i++) {

            if (i < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Function to display factors of a number
    public static void factors(int n) {
        System.out.println("Factors of " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Function to calculate GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Count Digits
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Number of Digits: " + countDigits(number));

        // Fibonacci
        System.out.print("\nEnter number of Fibonacci terms: ");
        int terms = sc.nextInt();
        fibonacci(terms);

        // Prime Numbers
        System.out.print("\nEnter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        primeNumbers(start, end);

        // Factors
        System.out.print("\nEnter a number to find factors: ");
        int factorNumber = sc.nextInt();

        factors(factorNumber);

        // GCD and LCM
        System.out.print("\nEnter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD = " + gcd(a, b));
        System.out.println("LCM = " + lcm(a, b));

        sc.close();
    }
}