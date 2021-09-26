package JavaEssential10.task2;

public class WhoIsBetween {
    public static int[] between(int a, int b) {
        int[] array = new int[Math.abs(a - b)+1];

        for (int i = 0; i < array.length; i++) {
            array[i] = a++;
        }
        return array;
    }
}
