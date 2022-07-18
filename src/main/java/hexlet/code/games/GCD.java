package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void launchGame() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int number1 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int number2 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            questionsAndAnswers[i][0] = String.format("%s %s", number1, number2);
            questionsAndAnswers[i][1] = String.valueOf(calculateGCDByEuclids(number1, number2));
        }
        Engine.roundsData(TASK, questionsAndAnswers);
    }

    public static int calculateGCDByEuclids(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return calculateGCDByEuclids(number2, number1 % number2);
    }
}
