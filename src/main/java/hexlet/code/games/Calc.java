package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String TASK = "What is the result of the expression?";
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void launchGame() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_ROUNDS][Engine.ARRAY_LENGTH];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int number1 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int number2 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int count = Utils.getRandomNumber(0, OPERATORS.length - 1);
            questionsAndAnswers[i][Engine.QUESTION_COUNT] = String.format("%s %s %s", number1,
                    OPERATORS[count], number2);
            questionsAndAnswers[i][Engine.ANSWER_COUNT] = makeCalculation(number1,
                    number2, OPERATORS[count]);

        }
        Engine.runGame(TASK, questionsAndAnswers);
    }

    public static String makeCalculation(int number1, int number2, String operator) {
        int resultOfOperation = 0;
        switch (operator) {
            case "+":
                resultOfOperation = number1 + number2;
                break;
            case "-":
                resultOfOperation = number1 - number2;
                break;
            case "*":
                resultOfOperation = number1 * number2;
                break;
            default:
                break;
        }
        return String.valueOf(resultOfOperation);
    }
}
