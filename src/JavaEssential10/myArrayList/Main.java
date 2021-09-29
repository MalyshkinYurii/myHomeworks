package JavaEssential10.myArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(6);
        myArrayList.add(2);
        myArrayList.add(55);
        myArrayList.remove(2);
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.indexOf(1));



    }


}
