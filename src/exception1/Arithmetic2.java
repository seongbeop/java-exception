package exception1;

public class Arithmetic2 {
    public static void main(String[] args) {
        int c;

        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1; // 예외가 발생하여 이문장이 수행됨.
        }

    }
}
