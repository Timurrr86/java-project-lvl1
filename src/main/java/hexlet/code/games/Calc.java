package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String TASK = "What is the result of the expression?";
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void launchGame() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int number1 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int number2 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int count = Utils.getRandomNumber(0, OPERATORS.length - 1);
            questionsAndAnswers[i][0] = String.format("%s %s %s", number1,
                    OPERATORS[count], number2);
            questionsAndAnswers[i][1] = calculate(number1,
                    number2, OPERATORS[count]);

        }
        Engine.roundsData(TASK, questionsAndAnswers);
    }

    public static String calculate(int number1, int number2, char operator) {
        switch (operator) {
            case '+':
                return String.valueOf(number1 + number2);
            case '-':
                return String.valueOf(number1 - number2);
            case '*':
                return String.valueOf(number1 * number2);
            default:
                return "Something went wrong!";
        }
    }
}
