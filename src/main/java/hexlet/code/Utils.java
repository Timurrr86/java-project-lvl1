package hexlet.code;

public class Utils {

    public static int getRandomNumber(int MIN_RANDOM_NUMBER, int MAX_RANDOM_NUMBER) {
        //формируем число от 1 до 100
        return MIN_RANDOM_NUMBER + (int) (Math.random() * MAX_RANDOM_NUMBER);
    }
}
