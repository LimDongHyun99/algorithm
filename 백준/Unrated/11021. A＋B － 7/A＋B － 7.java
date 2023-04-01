import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();

                for (int i = 1; i <= N; i++) {
                        int A = sc.nextInt(); // A 입력받기
                        int B = sc.nextInt(); // B 입력받기
                        int sum = A + B; // A+B 계산하기
                        System.out.println("Case #" + i + ": " + sum); // 출력하기
                }
                sc.close();
        }
}