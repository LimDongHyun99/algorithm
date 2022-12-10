import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrAsc = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrDes = {8, 7, 6, 5, 4, 3, 2, 1};

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (Arrays.equals(arr, arrAsc)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr, arrDes)) {
            System.out.println("descending");
        } else
            System.out.println("mixed");
        }
    }