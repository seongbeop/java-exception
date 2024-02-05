package exception1;

public class Runtime1 {
    public void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;
        }
        System.out.println("당신의 별명은 " + nick + " 입니다.");

    }

    public static void main(String[] args) {
        Runtime1 runtime1 = new Runtime1();
        runtime1.sayNick("바보");
        runtime1.sayNick("야호");
    }
}
