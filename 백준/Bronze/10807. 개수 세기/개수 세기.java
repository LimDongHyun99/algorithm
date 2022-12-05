import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for (int j = 0; j < list.length; j++) {
            if(list[j] == v)
                count++;
        }
        System.out.println(count);
    }
}