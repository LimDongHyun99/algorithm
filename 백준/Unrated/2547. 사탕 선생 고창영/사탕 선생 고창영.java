import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
                Scanner sc = new Scanner(System.in);

                int t = sc.nextInt();
                for (int i = 0; i < t; i++) {
                        int n = sc.nextInt();
                        BigInteger sum = new BigInteger("0");
                        for (int j = 0; j < n; j++) {
                                sum = sum.add(BigInteger.valueOf(sc.nextLong()));
                        }
                        if (sum.mod(BigInteger.valueOf(n)).equals(BigInteger.ZERO)) {
                                System.out.println("YES");
                        } else {
                                System.out.println("NO");
                        }
                }
                sc.close();
        }
}