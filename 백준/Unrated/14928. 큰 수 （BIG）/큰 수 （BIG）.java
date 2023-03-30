import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String n = br.readLine();

                long temp = 0;
                // 각 자릿수를 계산하여 20000303으로 나누어 나머지를 계산하는 과정
                for (int i = 0; i < n.length(); i++) {
                        // charAt 함수를 사용하여 i번째 자릿수를 가져오고, '0'을 빼서 int로 변환
                        // 입력받은 문자열을 int형으로 변환하는 과정
                        temp = (temp * 10 + (n.charAt(i) - '0')) % 20000303;
                }
                System.out.println(temp);
                br.close();
        }
}