import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int lostMoney = 0; // 잃은 돈의 총합
                int bettingMoney; // 베팅한 돈
                while (true) {
                        bettingMoney = sc.nextInt(); // 베팅한 돈 입력받기
                        if (bettingMoney == -1) {
                                break; // 입력 종료
                        }
                        lostMoney += bettingMoney; // 베팅한 돈을 잃은 돈의 총합에 더하기
                }
                System.out.println(lostMoney); // 잃은 돈의 총합 출력
                sc.close();
        }
}