import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if (str.equals("#"))
                break;
            String[] strArr = str.toLowerCase().split("");
            int count = 0;
            for (int i = 0; i < strArr.length; i++) {
                if (str.split(" ")[0].equals(strArr[i]))
                    count++;
            }
            System.out.println(str.split(" ")[0] + " " + (count - 1));
        }
    }
}
