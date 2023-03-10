import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
                Scanner sc = new Scanner(System.in);

                // 기차의 속도, 파리의 속도, 처음 두 기차 사이의 거리 입력 받기
                int S = sc.nextInt();
                int T = sc.nextInt();
                int D = sc.nextInt();

                // 두 기차가 만날 때까지 걸리는 시간 계산하기
                int time = D / (S * 2);

                // 파리가 이동한 거리 계산하기
                int F = time * T;

                System.out.println(F);
                sc.close();
            }
        }