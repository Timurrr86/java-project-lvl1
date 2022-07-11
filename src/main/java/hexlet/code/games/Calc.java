package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String TASK = "What is the result of the expression?";
    private static final String[] QUESTIONS = new String[Engine.NUMBEROFROUNDS];
    private static final String[] CORRECTANSWER = new String[Engine.NUMBEROFROUNDS];
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void play() {
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            String[] operators = {"+", "-", "*"};
            int randomNumber1 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int randomNumber2 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int count = (int) (Math.random() * 2);
            QUESTIONS[i] = String.format("%s %s %s", randomNumber1, operators[count], randomNumber2);
            int resultOfOperation = 0;
            switch (operators[count]) {
                case "+":
                    resultOfOperation = randomNumber1 + randomNumber2;
                    break;
                case "-":
                    resultOfOperation = randomNumber1 - randomNumber2;
                    break;
                case "*":
                    resultOfOperation = randomNumber1 * randomNumber2;
                    break;
                default:
                    break;
            }
            CORRECTANSWER[i] = String.valueOf(resultOfOperation);
        }
        Engine.runGame(TASK, QUESTIONS, CORRECTANSWER);
    }
}
