package javaEssential1.Dz1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины сторон прямоугольника: ");
        Rectangle rectangle = new Rectangle();
        rectangle.setSide1(scanner.nextDouble());
        rectangle.setSide2(scanner.nextDouble());
        System.out.println("Площаль прямоугольника: " + rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2()));
        System.out.println("Периметр прямоугольника: " + rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2()));
    }
}
