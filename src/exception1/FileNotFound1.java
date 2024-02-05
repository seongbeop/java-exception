package exception1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
        br.readLine();
        br.close();
        // FileNotFoundException 발생  파일을 찾을 수 없음
    }
}
