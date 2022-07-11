package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        if (num.hasNextInt()) {
            int inputNumber = num.nextInt();
            switch (inputNumber) {
                case EXIT:
                    System.out.println("See you next time");
                    break;
                case GREET:
                    Cli.greet();
                    break;
                case EVEN:
                    Even.play();
                    break;
                case CALC:
                    Calc.play();
                    break;
                case GCD_GAME:
                    GCD.play();
                    break;
                case PROGRESSION:
                    Progression.play();
                    break;
                case PRIME:
                    Prime.play();
                    break;
                default:
                    System.out.println("Please choose existing game");
                    break;
            }
        }
    }
}
