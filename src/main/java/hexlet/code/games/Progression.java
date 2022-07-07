package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final String task = "What number is missing in the progression?\n";
    private static final String[] questions = new String[3];
    private static final String[] correctAnswer = new String[3];
    public static void play() {
        for(int i = 0; i < 3; i++) {
            int[] numbers = getProgression();
            int maskedNumber = 1 + (int) (Math.random() * 10);
            String maskedProgression = getMaskedProgression(numbers, maskedNumber);
            questions[i] = maskedProgression;
            correctAnswer[i] = String.valueOf(numbers[maskedNumber]);
        }
        Engine.gameBody(task, questions, correctAnswer);

    }
    public static int[] getProgression() {
        int[] numbers = new int[10];
        int firstProgressionElement = 1 + (int) (Math.random() * 100);
        int stepOfProgression = 1 + (int) (Math.random() * 10);
        numbers[0] = firstProgressionElement;
        for(int i = 1; i < numbers.length; i++) {
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
