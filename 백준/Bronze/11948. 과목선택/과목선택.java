import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            int[] scores = new int[6];
            for (int i = 0; i < 6; i++) {
                scores[i] = sc.nextInt();
            }
            int scienceSum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    for (int k = j + 1; k < 4; k++) {
                        int sum = scores[i] + scores[j] + scores[k];
                        scienceSum = Math.max(scienceSum, sum);
                    }
                }
            }
            int socialSum = Math.max(scores[4], scores[5]);
            int totalSum = scienceSum + socialSum;
            System.out.println(totalSum);
            sc.close();
        }
}