package JavaEssential7.task3;

enum Animals {
    PENGUIN(20), SHARK(15), DOG(9), CAT(4);
    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "age=" + age +
                '}';
    }
}

public class Main {


    public static void main(String[] args) {
        Animals[] animals = {Animals.CAT, Animals.DOG, Animals.PENGUIN, Animals.SHARK};
        for (Animals a :
                animals) {
            System.out.println(a);
        }

    }
}
