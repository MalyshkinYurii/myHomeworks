package JavaEssential6.task2;

public class Vehicle {
    private class Wheel {
        String color = "Зеленый";
    }

    private class Door {
        String color = "Красный";
    }

    void printWheelColor() {
        Wheel wheel = new Wheel();
        System.out.println("Цвет колеса " + wheel.color);
    }

    void printDoorColor() {
        Door door = new Door();
        System.out.println("Двери " + door.color);
    }
}
