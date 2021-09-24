package JavaEssential8.task2;

public class Worker {
    String name;
    String position;
    int startYear;

    public Worker(String name, String position, int startYear) {
        this.name = name;
        this.position = position;
        this.startYear = startYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", startYear=" + startYear +
                '}';
    }
}
