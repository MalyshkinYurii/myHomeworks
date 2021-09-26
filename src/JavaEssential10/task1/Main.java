package JavaEssential10.task1;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, Integer> myDictionary = new MyDictionary<>();
        myDictionary.addElem("Вова", 23);
        myDictionary.addElem("Катя", 22);
        myDictionary.addElem("Юра", 21);
        myDictionary.addElem("Ира", 43);
        myDictionary.addElem("Саша", 66);
        myDictionary.addElem("Миша", 12);


        System.out.println("Размер списка: " + myDictionary.size());
        System.out.println("Значение элеента по ключу: " + myDictionary.getValue("Миша"));

    }
}
