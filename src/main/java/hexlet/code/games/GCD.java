package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static final String[] QUESTIONS = new String[Engine.NUMBEROFROUNDS];
    private static final String[] CORRECTANSWER = new String[Engine.NUMBEROFROUNDS];

    public static void play() {
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            //выводим число в диапазоне от 1 до 100
            int randomNumber1 = Engine.getRandomNumber();
            int randomNumber2 = Engine.getRandomNumber();
            //вычисляем вероятный максимально возможный делитель - минимальное из двух чисел
            int maxDivisor = Math.min(randomNumber1, randomNumber2);
            QUESTIONS[i] = String.format("%s %s", randomNumber1, randomNumber2);
            //проходим в цикле от максимально возможного в обратную сторону
            for (int n = maxDivisor; n >= 1; n--) {
                if (randomNumber1 % n == 0 && randomNumber2 % n == 0) {
                    CORRECTANSWER[i] = String.valueOf(n);
                    break;
                }
            }
        }
        Engine.runGame(TASK, QUESTIONS, CORRECTANSWER);
    }

}
