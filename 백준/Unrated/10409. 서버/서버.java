import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt(); // 일의 개수
                int T = sc.nextInt(); // 주어진 시간
                int[] times = new int[n]; // 각 일의 수행 시간을 저장할 배열

                // 각 일의 수행 시간 입력
                for (int i = 0; i < n; i++) {
                        times[i] = sc.nextInt();
                }

                int count = 0; // 처리한 일의 개수
                int timeLeft = T; // 남은 시간

                // 일을 처리하면서 남은 시간을 계속해서 추적
                for (int i = 0; i < n; i++) {
                        if (times[i] <= timeLeft) { // 처리할 수 있는 경우
                                count++; // 처리한 일의 개수 증가
                                timeLeft -= times[i]; // 남은 시간 갱신
                        } else { // 더 이상 처리할 수 없는 경우
                                break; // 종료
                        }
                }
                System.out.println(count); // 처리한 일의 개수 출력
                sc.close();
        }
}