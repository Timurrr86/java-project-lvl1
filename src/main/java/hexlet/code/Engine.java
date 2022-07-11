package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBEROFROUNDS = 3;
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 1;

    public static String getAnswer() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static void runGame(String task, String[] questions, String[] correctAnswer) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scName = new Scanner(System.in);
        String name = scName.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        int numberOfCorrectAnswer = 0;
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            //выводим число в диапазоне от 1 до 100
            System.out.print("Question: ");
            System.out.println(questions[i]);
            String answer = Engine.getAnswer();
            if (answer.equals(correctAnswer[i])) {
                System.out.println("Correct!");
                numberOfCorrectAnswer += 1;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer[i] + "'");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (numberOfCorrectAnswer >= Engine.NUMBEROFROUNDS) {
            System.out.println("Congratulations, " + name + "!");
        }
        scName.close();
    }
}
