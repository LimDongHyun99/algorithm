import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt(); // 현재 시
            int b = sc.nextInt(); // 현재 분
            int c = sc.nextInt(); // 오븐구이 시간

            // 오븐구이가 끝나는 시각 계산
            int total = a * 60 + b + c; // 분으로 계산
            int hour = (total / 60) % 24; // 시 계산
            int minute = total % 60; // 분 계산

            System.out.println(hour + " " + minute);
            sc.close();
        }
}