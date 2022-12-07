import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i])
                max = num[i];
        }

        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (min > num[i])
                min = num[i];
        }
        System.out.println(min + " " + max);
    }
}