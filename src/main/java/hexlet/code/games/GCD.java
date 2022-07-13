package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void launchGame() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_ROUNDS][Engine.ARRAY_LENGTH];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            //выводим число в диапазоне от 1 до 100
            int randomNumber1 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int randomNumber2 = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            questionsAndAnswers[i][Engine.QUESTION_COUNT] = String.format("%s %s", randomNumber1, randomNumber2);
            questionsAndAnswers[i][Engine.ANSWER_COUNT] = String.valueOf(calculateGCDByEuclids(randomNumber1, randomNumber2));
        }
        Engine.runGame(TASK, questionsAndAnswers);
    }

    public static int calculateGCDByEuclids(int randomNumber1, int randomNumber2) {
        if (randomNumber2 == 0) {
            return randomNumber1;
        }
        return calculateGCDByEuclids(randomNumber2, randomNumber1 % randomNumber2);
    }
}
