import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] n = br.readLine().split(" ");
        int D = Integer.parseInt(n[0]);
        int H = Integer.parseInt(n[1]);
        int W = Integer.parseInt(n[2]);

        // 피타고라스의 정의
        double diagonal = Math.sqrt(Math.pow(H, 2) + Math.pow(W, 2));

        // 대각선 길이와 비율을 이용하여 높이와 너비를 구합니다.
        double length = D / diagonal;
        int height = (int) Math.floor(H * length);
        int width = (int) Math.floor(W * length);
        System.out.println(height + " " + width);
        br.close();
    }
}