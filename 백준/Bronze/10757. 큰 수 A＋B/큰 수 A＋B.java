import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigNumber1 = new BigInteger(sc.nextBigInteger().toByteArray());
        BigInteger bigNumber2 = new BigInteger(sc.nextBigInteger().toByteArray());

        bigNumber1 = bigNumber1.add(bigNumber2);

        System.out.println(bigNumber1);
        sc.close();
        }
    }