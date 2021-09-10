package javaEssential4.task2;

public class DOCHandler extends AbstractHandler {
    @Override
    void change() {
        System.out.println("Редактирование Doc файла");
    }

    @Override
    void create() {
        System.out.println("Создание Doc файла");
    }

    @Override
    void open() {
        System.out.println("Открытие Doc файла");
    }

    @Override
    void save() {
        System.out.println("Сохранение Doc файла");
    }
}
