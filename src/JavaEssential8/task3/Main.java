package JavaEssential8.task3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Price> prices = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Введите название товара: ");
            String name = sc.next();
            System.out.println("Введите стоимость товара: ");
            int startYear = sc.nextInt();
            System.out.println();
            System.out.println("Введите название магазина: ");
            String store = sc.next();
            Price price = new Price(name, store, startYear);
            prices.add(price);

        }
        prices.sort(Comparator.comparing(Price::getStore));

        System.out.println(prices.toString());
        ArrayList<String> names = new ArrayList<>(0);

        System.out.println("Введите название магазина: ");
        String storeName = sc.next();
        for (Price price :
                prices) {
            if (storeName.equalsIgnoreCase(price.getStore())) {
                String a = price.getName();
                names.add(a);
            }
        }
        if (names.isEmpty()) {
            try {
                throw new Exception("Incorrect store!");
            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            for (String array :
                    names) {
                System.out.println("В данном магазине продаются следующий товар: " + array);
            }
        }

    }


}

