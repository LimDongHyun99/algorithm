import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner를 이용하여 입력값을 받음
        int n = sc.nextInt();  // 파일 개수 입력
        String[] filenames = new String[n];  // 파일 이름들을 저장할 문자열 배열 생성

        // n개의 파일 이름을 입력받아 배열에 저장
        for (int i = 0; i < n; i++) {
            filenames[i] = sc.next();
        }

        String pattern = filenames[0];  // 첫 번째 파일 이름으로부터 시작하여 패턴 만듦
        int len = pattern.length();  // 문자열 길이 구하기

        // 각 문자열의 i번째 문자를 비교하여 패턴 만들기
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < n; j++) {
                if (pattern.charAt(i) != filenames[j].charAt(i)) {
                    pattern = pattern.substring(0, i) + "?" + pattern.substring(i + 1);  // 문자열 i번째 위치의 문자를 "?"로 바꾸기
                    break;
                }
            }
        }
        System.out.println(pattern);  // 패턴 출력
        sc.close(); // Scanner 종료
    }
}