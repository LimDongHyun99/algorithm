import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += str.charAt(i) -'0';
        }
        System.out.println(answer);
        sc.close();
    }
}