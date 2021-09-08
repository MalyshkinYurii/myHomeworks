package javaEssential3.task2;

public class GoodPupil extends Pupil {
    @Override
    void read() {
        System.out.println("Читает на 4");
    }

    @Override
    void study() {
        System.out.println("Учится на 4");
    }

    @Override
    void write() {
        System.out.println("Пишет на 4");
    }

    @Override
    void relax() {
        System.out.println("Отдыхает не много");
    }
}
