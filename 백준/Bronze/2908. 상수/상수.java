import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        String str1;
        String str2;

        str1 = Character.toString(a.charAt(2)) +
                Character.toString(a.charAt(1)) +
                Character.toString(a.charAt(0));
        str2 = Character.toString(b.charAt(2)) +
                Character.toString(b.charAt(1)) +
                Character.toString(b.charAt(0));

        if(Integer.parseInt(str1) > Integer.parseInt(str2)) {
            System.out.println(str1);
        } else {
            System.out.println(str2);
        }
    }
}