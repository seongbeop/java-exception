package exception1;

class FoolException2 extends Exception {

}
public class Runtime3 {
    public void sayNick(String nick) throws FoolException2{ // throws 메서드 선언부에서 사용되며 , 해당 메서드가 처리하지 않은 예외를 호출자에게 전달


            if ("바보".equals(nick)) {
                throw new FoolException2();  // throw 메서드 내에서 예외를 발생시키는 데 사용
                // 바보가 입력되면 예외를 발생시킴
                // Exception 은 예측 가능한 경우 - Checked Exception
                // RuntimeException 은 발생할 수도 있고 발생하지 않을 수도 있는 경우 Unchecked Exception
            }
            System.out.println("당신의 별명은 " + nick + " 입니다.");




    }

    public static void main(String[] args) {
        Runtime3 runtime3 = new Runtime3();
        try {

            runtime3.sayNick("바보");
            runtime3.sayNick("야호");
        } catch (FoolException2 e) {
            System.out.println("FoolException2가 발생했습니다.");
        }
    }
}
