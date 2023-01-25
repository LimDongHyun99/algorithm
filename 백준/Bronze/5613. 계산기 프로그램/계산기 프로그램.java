import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (true) {
            String str = sc.nextLine();
            if (str.equals("="))
                break;
            switch (str) {
                case "+":
                    a += sc.nextInt();
                    break;
                case "-":
                    a -= sc.nextInt();
                    break;
                case "*":
                    a *= sc.nextInt();
                    break;
                case "/":
                    a /= sc.nextInt();
                    break;
                default:
                    break;
            }
        }
        System.out.println(a);
        sc.close();
    }
}