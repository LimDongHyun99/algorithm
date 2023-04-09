import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weightOnEarth = 0; // 지구에서의 무게를 저장할 변수
        while (true) { // 무한 반복문
            weightOnEarth = sc.nextDouble(); // 지구에서의 무게 입력받기
            if (weightOnEarth < 0) { // 입력이 음수이면 반복문 탈출
                break;
            }
            double weightOnMoon = weightOnEarth * 0.167; // 달에서의 무게 계산
            // 출력문, %.2f는 소수점 둘째자리까지 출력하도록 하는 포맷 문자열
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", weightOnEarth, weightOnMoon);
        }
        sc.close();
    }
}