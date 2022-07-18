package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int STEPOFPROGRESSION = 10;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void launchGame() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int[] numbers = generateProgression();
            int maskedNumber = (int) (Math.random() * STEPOFPROGRESSION);
            String maskedProgression = generateMaskedProgression(numbers, maskedNumber);
            questionsAndAnswers[i][0] = maskedProgression;
            questionsAndAnswers[i][1] = String.valueOf(numbers[maskedNumber]);
        }
        Engine.roundsData(TASK, questionsAndAnswers);

    }

    public static int[] generateProgression() {
        int[] numbers = new int[STEPOFPROGRESSION];
        int firstProgressionElement = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        int stepOfProgression = Utils.getRandomNumber(MIN_RANDOM_NUMBER, STEPOFPROGRESSION);
        numbers[0] = firstProgressionElement;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + stepOfProgression;
        }
        return numbers;
    }

    public static String generateMaskedProgression(int[] numbers, int maskedNumber) {
        var sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == maskedNumber) {
                sb.append("..");
                sb.append(" ");
            } else {
                sb.append(numbers[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
