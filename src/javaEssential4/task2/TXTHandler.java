package javaEssential4.task2;

public class TXTHandler extends AbstractHandler {
    @Override
    void change() {
        System.out.println("Редактирование Txt файла");
    }

    @Override
    void create() {
        System.out.println("Создание Txt файла");
    }

    @Override
    void open() {
        System.out.println("Открытие Txt файла");
    }

    @Override
    void save() {
        System.out.println("Сохранение Txt файла");
    }
}
