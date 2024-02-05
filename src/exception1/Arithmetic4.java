package exception1;

public class Arithmetic4 {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Arithmetic4 arithmetic4 = new Arithmetic4();
        int c;

        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1; // 예외가 발생하여 이문장이 수행됨.
        }finally {
            arithmetic4.shouldBeRun(); // 예외에 상관없이 무조건 실행된다.

        }

    }
}
