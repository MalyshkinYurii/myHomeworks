package javaEssential1.Dz2;

public class Book {
    public static void main(String[] args) {
        Author author = new Author("Марк Твен");
        Title title = new Title("Приключение Тома Соера");
        Content content = new Content("О приключение пацана");
        author.show();
        title.show();
        content.show();
    }
}
