package JavaEssential6.task3;

public class Distance {
    double distance = 5000;

    void print() {
        System.out.println("5000 километров в метры: " + Converter.kilometresTometres(distance));
        System.out.println("5000 километров в мили: " + Converter.kilometresTomiles(distance));
        System.out.println("5000 метров в километры: " + Converter.metresToKilometres(distance));
    }

    static class Converter {
        static double metresToKilometres(double distance) {
            return distance / 1000;
        }

        static double kilometresTometres(double distance) {
            return distance * 1000;
        }

        static double kilometresTomiles(double distance) {
            return distance * 0.62;
        }
    }
}
