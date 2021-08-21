package com.company.NormalPrograms;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int s = sc.nextInt();
        int temp=0;

        for (int i = 2; i <s-1 ; i++) {
            if (s % i == 0) {
                temp = temp + 1;
            }
        }
        if(temp==0){
            System.out.println("Number is  Prime " +s);

        }
        else {
            System.out.println("Number is not Prime " +s);
        }
    }
}
