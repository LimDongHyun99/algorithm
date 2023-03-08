import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt(); // 방학 기간
        int a = sc.nextInt(); // 국어 숙제 페이지 수
        int b = sc.nextInt(); // 수학 숙제 페이지 수
        int c = sc.nextInt(); // 하루에 풀 수 있는 최대 국어 페이지 수
        int d = sc.nextInt(); // 하루에 풀 수 있는 최대 수학 페이지 수

        // 국어, 수학 숙제 중 더 오래 걸리는 숙제 기간 계산
        int koreanDays = (a % c == 0) ? a / c : a / c + 1;
        int mathDays = (b % d == 0) ? b / d : b / d + 1;

        // 놀 수 있는 최대 날의 수 계산
        int vacationDays = (koreanDays > mathDays) ? l - koreanDays : l - mathDays;

        // 결과 출력
        System.out.println(vacationDays);
    }
}