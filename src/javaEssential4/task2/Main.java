package javaEssential4.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите формат документа: ");
        String docType = sc.next();
        if (docType.equalsIgnoreCase("xml")) {
            XMLHandler xmlHandler = new XMLHandler();
            xmlHandler.open();
            xmlHandler.change();
            xmlHandler.create();
            xmlHandler.save();
        } else if (docType.equalsIgnoreCase("txt")) {
            TXTHandler txtHandler = new TXTHandler();
            txtHandler.open();
            txtHandler.change();
            txtHandler.create();
            txtHandler.save();
        } else if (docType.equalsIgnoreCase("doc")) {
            DOCHandler docHandler = new DOCHandler();
            docHandler.open();
            docHandler.change();
            docHandler.create();
            docHandler.save();
        } else {
            System.out.println("Вы ввели неправильный тип документа");
        }
    }
}
