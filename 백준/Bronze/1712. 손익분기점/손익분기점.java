import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int bep = 0;
        sc.close();
        if(b>=c) {
            bep = -1;
        } else {
            bep = a / (c-b) +1;
        }
        System.out.println(bep);
    }
}