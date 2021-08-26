package lesson6;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Прямоугольник: ");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println();
        System.out.println("Прямоугольный треугольник: ");
        System.out.println();

        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println();
        System.out.println("Равносторонний треугольник: ");
        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Ромб: ");
        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = i - 1; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("*************");
        //
        for (int i = 5; i >= 0; i--) {
            for (int j = i - 1; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
