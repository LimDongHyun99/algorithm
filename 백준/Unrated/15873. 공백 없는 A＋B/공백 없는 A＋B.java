import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                if (str.charAt(1) == '0') { // s 문자열의 두 번째 문자가 '0'인 경우
                        // s 문자열의 세 번째부터 끝까지를 정수로 변환하여 10을 더한 후 출력
                        System.out.println(10 + Integer.parseInt(str.substring(2)));
                } else {  // s 문자열의 두 번째 문자가 '0'이 아닌 경우
                        // s 문자열의 첫 번째 문자를 숫자로 변환하여 s 문자열의 두 번째부터 끝까지를 정수로 변환한 값과 더한 후 출력
                        System.out.println(Character.getNumericValue(str.charAt(0)) + Integer.parseInt(str.substring(1)));
                }
                sc.close();
        }
}