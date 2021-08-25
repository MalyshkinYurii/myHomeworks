package com.company.lesson4;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	double operand1 = 2, operand2 = 4;
        Scanner sc = new Scanner(System.in);
        String sign = sc.next();
        switch (sign) {
            case "*":
                System.out.println(operand1*operand2);
                break;
            case  "/":
                if(operand2 == 0){
                    System.out.println("Нельзя делить на ноль");
                }
                else System.out.println(operand1/operand2);
                break;
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;
        }
    }
}
