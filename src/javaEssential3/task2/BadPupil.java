package javaEssential3.task2;

public class BadPupil extends Pupil {
    @Override
    void read() {
        System.out.println("Читает на 2");
    }

    @Override
    void study() {
        System.out.println("Учится на 2");
    }

    @Override
    void write() {
        System.out.println("Пишет на 2");
    }

    @Override
    void relax() {
        System.out.println("Отдыхает много");
    }
}
