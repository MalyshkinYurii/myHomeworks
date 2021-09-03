package javaEssential1.Dz2;

public class Author {
    String aName;
    public Author(String aName) {
        this.aName = aName;
    }
    public void show(){
        System.out.println("Имя автора: " + aName);
    }
}
