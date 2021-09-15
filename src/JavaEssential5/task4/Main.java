package JavaEssential5.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10);
            rand += 10;
            arrayList.add(rand);
        }
        System.out.println(arrayList.toString());
        Collections.sort(arrayList);
        System.out.println("Отсортированный массив: " + arrayList.toString());
        System.out.println("Минимальный елемент: " + arrayList.get(0));
        System.out.println("Максимальный елемент: " + arrayList.get(9));
        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            Integer element = listIterator.next();
            listIterator.set(element + 1);
        }
        System.out.println("Увеличение каждого элемента на 1: " + arrayList.toString());
    }
}
