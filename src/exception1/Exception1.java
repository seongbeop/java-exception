package exception1;

public class Exception1 {
    public static void main(String[] args) {
        int a, b, c;
        try {
            a = 10;
            b = 0;
            c = a / b;
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } catch (ArithmeticException e) {
            System.out.println("산술 오류 발생");

        } catch (Exception e) { // 모든 예외 처리 가능 가장 상위 Exception (다형성 , 상속)
            System.out.println("NumberFormatException, ArithmeticException 이외의 다른 오류 발생");
        }
    }
}
