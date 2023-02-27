import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] callList = new int[n];

        for (int i = 0; i < n; i++) {
            callList[i] = sc.nextInt();
        }

        int yPrice = 0;
        int mPrice = 0;

        for (int callTime : callList) {
            yPrice += (callTime / 30 + 1) * 10;
            mPrice += (callTime / 60 + 1) * 15;
        }

        if (yPrice < mPrice) {
            System.out.println("Y " + yPrice);
        } else if (yPrice > mPrice) {
            System.out.println("M " + mPrice);
        } else {
            System.out.println("Y M " + yPrice);
        }
        sc.close();
    }
}