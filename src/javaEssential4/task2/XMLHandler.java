package javaEssential4.task2;

public class XMLHandler extends AbstractHandler {
    @Override
    void change() {
        System.out.println("Редактирование Xml файла");
    }

    @Override
    void create() {
        System.out.println("Создание Xml файла");
    }

    @Override
    void open() {
        System.out.println("Открытие Xml файла");
    }

    @Override
    void save() {
        System.out.println("Сохранение Xml файла");
    }
}
