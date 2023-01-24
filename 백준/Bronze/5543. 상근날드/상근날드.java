import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int burger = 2001;
        int drink = 2001;

        for (int i = 0; i < 3; i++) {
            int a = in.nextInt();
            if (a < burger) {
                burger = a;
            }
        }

        for (int i = 0; i < 2; i++) {
            int a = in.nextInt();
            if (a < drink) {
                drink = a;
            }
        }
        System.out.println(burger + drink - 50);
    }
}