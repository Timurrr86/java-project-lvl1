package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int EXIT_0 = 0;
    private static final int GREET_1 = 1;
    private static final int EVEN_2 = 2;
    private static final int CALC_3 = 3;
    private static final int GCD_4 = 4;
    private static final int PROGRESSION_5 = 5;
    private static final int PRIME_6 = 6;

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
                case EXIT_0:
                    System.out.println("See you next time");
                    break;
                case GREET_1:
                    Cli.getName();
                    break;
                case EVEN_2:
                    Even.play();
                    break;
                case CALC_3:
                    Calc.play();
                    break;
                case GCD_4:
                    GCD.play();
                    break;
                case PROGRESSION_5:
                    Progression.play();
                    break;
                case PRIME_6:
                    Prime.play();
                    break;
                default:
                    System.out.println("Please choose existence game");
                    break;
            }
        }
    }
}
