package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_ROUNDS = 3;
    public static final int QUESTION_COUNT = 0;
    public static final int ANSWER_COUNT = 1;
    public static final int ARRAY_LENGTH = 2;

    public static void runGame(String task, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scName = new Scanner(System.in);
        String name = scName.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            //выводим число в диапазоне от 1 до 100
            System.out.print("Question: ");
            System.out.println(questionsAndAnswers[i][Engine.QUESTION_COUNT]);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if (!answer.equals(questionsAndAnswers[i][Engine.ANSWER_COUNT])) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + questionsAndAnswers[i][Engine.ANSWER_COUNT] + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
        scName.close();
    }
}
