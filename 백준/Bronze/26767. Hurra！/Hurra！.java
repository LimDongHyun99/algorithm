import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                        if (i % 7 == 0 && i % 11 == 0) { // 7과 11의 배수가 참인 경우
                                System.out.println("Wiwat!");
                        } else if (i % 7 == 0) { // 7의 배수가 참인경우
                                System.out.println("Hurra!");
                        } else if (i % 11 == 0) { // 11의 배수가 참인 경우
                                System.out.println("Super!");
                        } else { // 그 외 것들은 숫자로 그대로 출력
                                System.out.println(i);
                        }
                }
                sc.close();
        }
}