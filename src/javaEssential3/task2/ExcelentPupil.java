package javaEssential3.task2;

public class ExcelentPupil extends Pupil {
    @Override
    void read() {
        System.out.println("Читает на 5");
    }

    @Override
    void study() {
        System.out.println("Учится на 5");
    }

    @Override
    void write() {
        System.out.println("Пишет на 5");
    }

    @Override
    void relax() {
        System.out.println("Отдыхает мало");
    }
}
