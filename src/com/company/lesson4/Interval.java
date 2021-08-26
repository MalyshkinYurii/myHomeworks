package com.company.lesson4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 0 && a <=14) {
            System.out.println("Число в диапазоне 0-14");
        }
        else if(a >= 15 && a <= 35){
            System.out.println("Число в диапазоне 15-35");
        }
        else if(a >= 36 && a <= 49){
            System.out.println("Число в диапазоне 36-49");
        }
        else if(a >= 50 && a <= 100) {
            System.out.println("Число в диапазоне 50-100");
        }
        else {
            System.out.println("Число не попадает в диапазон");
        }
    }
}
