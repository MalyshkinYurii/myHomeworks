package javaEssential4.task3;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Играть");
    }

    @Override
    public void record() {
        System.out.println("Записать");
    }

    @Override
    public void pause() {
        System.out.println("Поставить не паузу");

    }

    @Override
    public void stop() {
        System.out.println("Остановить");
    }
}
