import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split((" "));

            int r = Integer.parseInt(str[0]);
            String p = str[1];

            for (int j = 0; j < p.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(p.charAt(j));
                }
            }
            System.out.println();
        }
    }
}