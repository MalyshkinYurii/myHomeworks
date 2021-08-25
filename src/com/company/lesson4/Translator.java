package com.company.lesson4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sign = sc.next();
        switch (sign) {
            case "погода":
                System.out.println("weather");
                break;
            case  "жарко":
                System.out.println("hot");
                break;
            case "тепло":
                System.out.println("warm");
                break;
            case "холодно":
                System.out.println("cold");
                break;
            case "солнечно":
                System.out.println("sunny");
                break;
            case "дождливо":
                System.out.println("its rain");
                break;
            case "снежно":
                System.out.println("snowy");
                break;
            case "прохладно":
                System.out.println("chilly");
                break;
            case "ветренно":
                System.out.println("windy");
                break;
            case "красиво":
                System.out.println("beauty");
                break;
            default:
                System.out.println("такого слова в переводчике нет");
        }
    }
}

