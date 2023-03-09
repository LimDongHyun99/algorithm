import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
            int[] levels = new int[4];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                levels[i] = sc.nextInt();
            }

            // 배열 정렬하기
            Arrays.sort(levels);

            // 두 팀의 스킬 레벨 합계
            int team1 = levels[0] + levels[3];
            int team2 = levels[1] + levels[2];

            // 두 팀의 스킬 레벨 합계 차이의 최소값 출력하기
            System.out.println(Math.abs(team1 - team2));
            sc.close();
        }
}