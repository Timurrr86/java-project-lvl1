package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "0 - Exit\n");
        System.out.print("Your choice: ");
        if(num.hasNextInt()) {
            int inputNumber = num.nextInt();
            if(inputNumber == 1) {
                Cli.getName();
            }
            if(inputNumber == 2) {
                Even.play();
            }
            if(inputNumber == 3) {
                Calc.play();
            }
            if(inputNumber == 4) {
                GCD.play();
            }
            if(inputNumber == 5) {
                Progression.play();
            }
       }
    }
}
