import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Long> list; // 감소하는 수를 저장할 ArrayList

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); // 입력값 n을 받음
        list = new ArrayList<>(); // ArrayList 초기화
        
        if(n <= 10) { // 0부터 9까지의 한자리수는 모두 감소하는 수
            System.out.println(n); // 해당 수를 출력
        } else if(n > 1022) { // 9876543210까지의 수는 1022개 밖에 없으므로 그 이상일 경우 감소하는 수가 없음
            System.out.println("-1"); // -1을 출력
        } else {
            for(int i = 0; i < 10; i++) { // 0부터 9까지의 숫자로 시작하는 감소하는 수를 찾기 위해 반복문 실행
                bp(i, 1); // bp 함수를 호출하여 감소하는 수 찾기 시작
            }
            Collections.sort(list); // ArrayList에 저장된 감소하는 수들을 오름차순으로 정렬
 
            System.out.println(list.get(n)); // n번째 감소하는 수 출력
        }
    }    
    
    public static void bp(long num, int idx) { // num: 현재 수, idx: 자릿수
        if(idx > 10) { // 자릿수가 10이상이면 감소하는 수를 만들 수 없으므로 종료
            return;
        }
        
        list.add(num); // 감소하는 수를 ArrayList에 저장
        for(int i = 0; i < num % 10; i++) { // num의 마지막 자리 수보다 작은 수로 시작하는 감소하는 수를 찾기 위해 반복문 실행
            bp((num * 10) + i, idx + 1); // bp 함수를 재귀호출하여 다음 자릿수 찾기
        }
    }
}