package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    private static final String[] QUESTIONS = new String[Engine.NUMBEROFROUNDS];
    private static final String[] CORRECTANSWER = new String[Engine.NUMBEROFROUNDS];
    private static final int STEPOFPROGRESSION = 10;
    public static void play() {
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            int[] numbers = getProgression();
            int maskedNumber = 1 + (int) (Math.random() * STEPOFPROGRESSION);
            String maskedProgression = getMaskedProgression(numbers, maskedNumber);
            QUESTIONS[i] = maskedProgression;
            CORRECTANSWER[i] = String.valueOf(numbers[maskedNumber]);
        }
        Engine.gameBody(TASK, QUESTIONS, CORRECTANSWER);

    }
    public static int[] getProgression() {
        int[] numbers = new int[STEPOFPROGRESSION];
        int firstProgressionElement = Engine.MINRANDOMNUMBER + (int) (Math.random() * Engine.MAXRANDOMNUMBER);
        int stepOfProgression = Engine.MINRANDOMNUMBER + (int) (Math.random() * STEPOFPROGRESSION);
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
