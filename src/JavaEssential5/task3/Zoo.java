package JavaEssential5.task3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Кот");
        animals.add("Собака");
        animals.add("Жираф");
        animals.add("Слон");
        animals.add("Крокодил");
        animals.add("Пингвин");
        animals.add("Сорока");
        animals.add("Акула");
        System.out.println(animals.toString());


        animals.remove(7);
        animals.remove(3);
        animals.remove(5);
        System.out.println(animals.size());
        System.out.println(animals.toString());
    }
}
