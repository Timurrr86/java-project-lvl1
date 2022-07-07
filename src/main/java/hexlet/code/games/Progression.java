package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void play() {
        String name = Engine.getPlayerName();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?\n");
        int numberOfCorrectAnswer = 0;
        for(int i = 0; i < 3; i++) {
            int[] numbers = getProgression();
            int maskedNumber = 1 + (int) (Math.random() * 10);
            String maskedProgression = getMaskedProgression(numbers, maskedNumber);
            System.out.println("Question: " + maskedProgression);
            int answer = Engine.getAnswerInt();
            if(answer == numbers[maskedNumber]) {
                System.out.println("Correct!");
                numberOfCorrectAnswer += 1;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was" + " '" + numbers[maskedNumber] + "'" + ".\n" +
                        "Let's try again, " + name);
                break;
            }
            System.out.println();

        }
        if(numberOfCorrectAnswer >= 3) {
            System.out.println("Congratulations, " + name);
        }
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
