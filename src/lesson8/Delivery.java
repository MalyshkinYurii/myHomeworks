package lesson8;

public class Delivery {
    public static int recursion(int a) {
        if (a == 1) {
            return 1;
        } else {
            return recursion(a - 1) * a;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(3));

    }
}
