import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt(); // 그룹의 수

                // 제목 출력
                System.out.println("Gnomes:");

                // 각 그룹에 대해
                for (int i = 1; i <= N; i++) {
                        int[] beards = new int[3]; // 수염 길이 저장할 배열
                        for (int j = 0; j < 3; j++) {
                                beards[j] = sc.nextInt(); // 수염 길이 입력 받기
                        }

                        // 수염 길이가 최단부터 가장 긴 순서대로 정렬되어 있는 경우
                        if ((beards[0] < beards[1] && beards[1] < beards[2]) || (beards[0] > beards[1] && beards[1] > beards[2])) {
                                System.out.println("Ordered");
                        }
                        // 수염 길이가 제대로 정렬되어 있지 않은 경우
                        else {
                                System.out.println("Unordered");
                        }
                }
                sc.close();
        }
}