import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        sc.close();

        int[] arr = new int[26];
        int max = 0;
        char result = 0;

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;

            int max1 = arr[str.charAt(i) - 65];
            if(max < max1) {
                max = max1;
                result = str.charAt(i);
            } else if (max == max1) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}