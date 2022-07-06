package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String getPlayerName() {
        System.out.print("May I have your name? ");
        Scanner scName = new Scanner(System.in);
        return scName.next();
    }
    public static String getAnswer() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static int getAnswerInt() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void gameResult(int numberOfCorrectAnswer, String name) {
        if(numberOfCorrectAnswer >= 3) {
            System.out.println("Congratulations, " + name);
        }
    }
}
