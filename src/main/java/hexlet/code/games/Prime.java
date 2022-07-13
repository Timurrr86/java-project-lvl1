package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void launchGame() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_ROUNDS][Engine.ARRAY_LENGTH];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            questionsAndAnswers[i][Engine.QUESTION_COUNT] = String.valueOf(randomNumber);
            questionsAndAnswers[i][Engine.ANSWER_COUNT] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(TASK, questionsAndAnswers);
    }

    public static boolean isPrime(int randomNumber) {
        if (randomNumber == 1) {
            return false;
        }
        for (int n = 2; n < randomNumber; n++) {
            if (randomNumber % n == 0) {
                return false;
            }
        }
        return true;
    }
}
