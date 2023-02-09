import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int fire = 0;
                while (true) {
                    if (n == (1 + fire + fire * fire)) {
                        break;
                    }
                    fire++;
                    if (fire > 10101) {
                        break;
                    }
                }
                System.out.println(fire);
                sc.close();
            }
        }