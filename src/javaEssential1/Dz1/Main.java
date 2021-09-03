package javaEssential1.Dz1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины сторон прямоугольника: ");
        Rectangle rectangle = new Rectangle();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Площаль прямоугольника: " + rectangle.areaCalculator(a, b));
        System.out.println("Периметр прямоугольника: " + rectangle.perimeterCalculator(a, b));
    }
}
