import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();
            sc.close();

            int answer = 0;

            if (A < 0) {
                answer = (A * C * -1) + (B * E) + D;
            } else {
                answer = (B - A) * E;
            }
            System.out.println(answer);
            sc.close();
        }
}