package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    private static final String[] QUESTIONS = new String[Engine.NUMBEROFROUNDS];
    private static final String[] CORRECTANSWER = new String[Engine.NUMBEROFROUNDS];
    private static final int STEPOFPROGRESSION = 10;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void play() {
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            int[] numbers = getProgression();
            int maskedNumber = (int) (Math.random() * STEPOFPROGRESSION);
            String maskedProgression = getMaskedProgression(numbers, maskedNumber);
            QUESTIONS[i] = maskedProgression;
            CORRECTANSWER[i] = String.valueOf(numbers[maskedNumber]);
        }
        Engine.runGame(TASK, QUESTIONS, CORRECTANSWER);

    }

    public static int[] getProgression() {
        int[] numbers = new int[STEPOFPROGRESSION];
        int firstProgressionElement = MIN_RANDOM_NUMBER + (int) (Math.random() * MAX_RANDOM_NUMBER);
        int stepOfProgression = MIN_RANDOM_NUMBER + (int) (Math.random() * STEPOFPROGRESSION);
        numbers[0] = firstProgressionElement;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + stepOfProgression;
        }
        return numbers;
    }

    public static String getMaskedProgression(int[] numbers, int maskedNumber) {
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
