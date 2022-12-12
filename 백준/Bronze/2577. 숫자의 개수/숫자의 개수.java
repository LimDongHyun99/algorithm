import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int v = a*b*c;
        int count = 0;
        String str = Integer.toString(v);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)-'0' ==i)
                    count++;
            }
            System.out.println(count);
            count=0;
        }
    }
}