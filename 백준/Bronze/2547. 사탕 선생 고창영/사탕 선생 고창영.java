import java.math.BigInteger;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int t = sc.nextInt(); // 테스트 케이스 수
                for (int i = 0; i < t; i++) {
                        int n = sc.nextInt(); // 학생 수
                        BigInteger sum = new BigInteger("0"); // BigInteger 객체 생성 및 초기화
                        for (int j = 0; j < n; j++) {
                                // BigInteger 객체 sum에 입력받은 사탕의 수를 더해줌.
                                sum = sum.add(BigInteger.valueOf(sc.nextLong()));
                        }
                        // sum을 n으로 나눈 나머지가 0이면 YES를 출력
                        if (sum.mod(BigInteger.valueOf(n)).equals(BigInteger.ZERO)) {
                                System.out.println("YES");
                        } else { // sum을 n으로 나눈 나머지가 0이 아니면 NO를 출력
                                System.out.println("NO");
                        }
                }
                sc.close();
        }
}