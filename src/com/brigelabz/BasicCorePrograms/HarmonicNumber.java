package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {
        System.out.print("Enter Nth Harmonic number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.printf("The %dth Harmonic series: ", N);
        System.out.print("1");
        HarmonicNumber harmonicNumber = new HarmonicNumber();
        harmonicNumber.printNthHarmonicValue(N);
    }

    public void printNthHarmonicValue(int N){
        double nthHarmonicValue = 1;
        for(int i=2; i<=N; i++){
            System.out.print(" + 1/"+i);
            nthHarmonicValue += (double)1/i;
        }

        System.out.printf("\nThe %dth Harmonic value H%d: ",N,N);
        System.out.println(nthHarmonicValue);
    }
}
