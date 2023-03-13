import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt(); // 던진 성냥의 개수
                int w = sc.nextInt(); // 박스의 가로 크기
                int h = sc.nextInt(); // 박스의 세로 크기

                for (int i = 0; i < n; i++) {
                        int length = sc.nextInt(); // 성냥의 길이

                        // 박스의 대각선 길이를 계산
                        double diagonal = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));

                        // 성냥의 길이가 박스의 대각선 길이보다 작거나 같으면 박스에 들어갈 수 있음
                        if (length <= diagonal) {
                                System.out.println("DA");
                        } else {
                                System.out.println("NE");
                        }
                }
                sc.close();
        }
}