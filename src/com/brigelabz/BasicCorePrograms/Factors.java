package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The Prime factors are: ");
        primeFactorization(num);
    }
        public static void primeFactorization(int num) {
            for (int i = 2; i <= num; i++) {
                while (num % i == 0) {
                    System.out.println(i);
                    num = num / i;
                }
            }
        }

}
