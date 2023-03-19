import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();

                // 경우의 수는 두 개 뿐이다
                // 1. 사과 옮기기 + 오렌지 옮기기 = (A + D)
                // 2. 오렌지 옮기기 + 사과 옮기기 = (B + C)
                int answer = Math.min(a + d, b + c);
                System.out.println(answer);
                sc.close();
        }
}