package lesson8;

public class Calculator {
    public static String calculate(Integer a, Integer b, Integer c) {

        String s1 = (a /= 5).toString();
        String s2 = (b /= 5).toString();
        String s3 = (c /= 5).toString();
        return s1 + " " + s2 + " " + s3;
    }

    public static void main(String[] args) {
        System.out.println(calculate(10, 15, 20));
    }

}
