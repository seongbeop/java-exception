package exception1;

class FoolException extends RuntimeException {

}
public class Runtime2 {
    public void sayNick(String nick) {
        if ("바보".equals(nick)) {
            throw new FoolException();
            // 바보가 입력되면 예외를 발생시킴
            // Exception 은 예측 가능한 경우 - Checked Exception
            // RuntimeException 은 발생할 수도 있고 발생하지 않을 수도 있는 경우 Unchecked Exception
        }
        System.out.println("당신의 별명은 " + nick + " 입니다.");

    }

    public static void main(String[] args) {
        Runtime2 runtime1 = new Runtime2();
        runtime1.sayNick("바보");
        runtime1.sayNick("야호");
    }
}
