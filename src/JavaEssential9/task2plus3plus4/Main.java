package JavaEssential9.task2plus3plus4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("мануфактура", 2.00f, "2004qwe");
        System.out.println(device.toString());
        Monitor monitor = new Monitor("manudacture", 10.0f, "12312eqweqw", 10, 20);
        System.out.println(monitor.toString());
        Monitor monitor2 = new Monitor("manudacture", 10.0f, "12312eqweqw", 10, 20);
        Device device1 = new Device("что то", 123.1f, "123qwe");
        Device device2 = new Device("пример", 98.5f, "qwe123");
        System.out.println(monitor.equals(monitor2));
        System.out.println(monitor.hashCode() == monitor2.hashCode());
        System.out.println(monitor.equals(device));
        System.out.println(device.hashCode() == device2.hashCode());
    }
}
