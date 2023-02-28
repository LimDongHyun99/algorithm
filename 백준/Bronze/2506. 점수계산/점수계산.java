import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 문제의 개수 입력
        int[] scoreList = new int[n];
        for (int i = 0; i < n; i++) {
            scoreList[i] = sc.nextInt(); // 채점 결과 입력
        }
        
        int score = 0; 
        int bonus = 0; 
        boolean prevCorrect = false; // 이전 문제 맞았는지 여부
        for (int i = 0; i < n; i++) {
            if (scoreList[i] == 1) { // 문제를 맞혔을 경우
                if (prevCorrect) { // 이전 문제도 맞았을 경우
                    bonus++; // 가산점 1 증가
                } else { // 이전 문제가 틀렸거나 첫 문제일 경우
                    bonus = 1; // 가산점 초기화
                    prevCorrect = true; // 이전 문제를 맞았다고 설정
                }
                score += bonus; // 가산점 포함하여 총 점수 증가
            } else { // 문제를 틀렸을 경우
                prevCorrect = false; // 이전 문제를 틀렸다고 설정
                bonus = 0; // 가산점 초기화
            }
        }
        System.out.println(score); // 총 점수 출력
    }
}