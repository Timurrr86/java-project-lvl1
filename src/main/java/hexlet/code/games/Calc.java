package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String TASK = "What is the result of the expression?";
    private static final String[] QUESTIONS = new String[Engine.NUMBEROFROUNDS];
    private static final String[] CORRECTANSWER = new String[Engine.NUMBEROFROUNDS];
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void play() {
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            int randomNumber1 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int randomNumber2 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int count = Utils.getRandomNumber(0, OPERATORS.length - 1);
            QUESTIONS[i] = String.format("%s %s %s", randomNumber1, OPERATORS[count], randomNumber2);
            CORRECTANSWER[i] = makeCalculation(randomNumber1, randomNumber2, OPERATORS[count]);

        }
        Engine.runGame(TASK, QUESTIONS, CORRECTANSWER);
    }

    public static String makeCalculation(int randomNumber1, int randomNumber2, String operator) {
        int resultOfOperation = 0;
        switch (operator) {
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
        return String.valueOf(resultOfOperation);
    }
}
