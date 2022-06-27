package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getName() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        //if добавлен. чтобы избавиться от ошибки
        //java.util.NoSuchElementException: No line found...
        if(sc.hasNextLine()) {
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
}
