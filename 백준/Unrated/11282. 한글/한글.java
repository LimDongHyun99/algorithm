import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int N = Integer.parseInt(br.readLine());

                int CHO = 19;
                int JUNG = 21;
                int JONG = 28;

                int charIndex = N - 1; // 인덱스는 0부터 시작하므로 N에서 1을 뺌

                int jong = charIndex % JONG; // 종성 구하기
                charIndex /= JONG;

                int jung = charIndex % JUNG; // 중성 구하기
                charIndex /= JUNG;

                int cho = charIndex; // 초성 구하기

                char c = (char) ('가' + cho * 21 * 28 + jung * 28 + jong);
                System.out.println(c);
        }
}