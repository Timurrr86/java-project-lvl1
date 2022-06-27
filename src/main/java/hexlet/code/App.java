package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                    "1 - Greet\n" +
                    "0 - Exit\n");
        System.out.print("Your choice: ");
        if(num.hasNextInt()) {
            int inputNumber = num.nextInt();
            if(inputNumber == 1) {
                System.out.println("Welcome to the Brain Games!");
                Cli.getName();
            }
       }
    }
}
