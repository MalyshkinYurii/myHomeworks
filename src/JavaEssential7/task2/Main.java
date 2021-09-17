package JavaEssential7.task2;

import java.awt.*;

interface ErrorPrinter {
    void printError(String error);
}

public class Main {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";

    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter() {
            @Override
            public void printError(String error) {
                System.out.println(RED + error + RESET);
            }
        };
        errorPrinter.printError("TEST");

    }
}
