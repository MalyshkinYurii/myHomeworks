package JavaEssential7.add_task;

import JavaEssential6.task2.Vehicle;

enum Vehicles {
    PORSHE(20000) {
        public String getColor() {
            return "blue";
        }

    }, SUPRA(15000) {
        public String getColor() {
            return "red";
        }

    }, LANOS(1000) {
        public String getColor() {
            return "green";
        }

    };
    int price;

    Vehicles(int price) {
        this.price = price;
    }

    public abstract String getColor();

    public String toString() {
        return "Auto: " + super.toString() + ", price " + price + ", color " + getColor();
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicles[] vehicles = {Vehicles.LANOS, Vehicles.SUPRA, Vehicles.PORSHE};
        for (Vehicles vehicle :
                vehicles) {
            System.out.println(vehicle);
        }
    }
}
