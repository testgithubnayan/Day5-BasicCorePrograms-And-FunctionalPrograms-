package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

    public static void main(String[] args) {
        System.out.println("Enter Three Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        LargestAmongThreeNumbers obj = new LargestAmongThreeNumbers();
        obj.maxNumber(a,b,c);
    }

    public void maxNumber(int a , int b , int c){
        if(a > b && a > c){
            System.out.println("a is grater number");
        } else if (b > a && b > c) {
            System.out.println("b is grater number");
        }
        else{
            System.out.println("c is grater number");
        }
    }
}
