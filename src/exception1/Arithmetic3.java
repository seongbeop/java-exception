package exception1;

public class Arithmetic3 {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Arithmetic3 arithmetic3 = new Arithmetic3();
        int c;

        try {
            c = 4 / 0;
            arithmetic3.shouldBeRun(); // 이 코드는 실행되지 않는다.
        } catch (ArithmeticException e) {
            c = -1; // 예외가 발생하여 이문장이 수행됨.
        }

    }
}
