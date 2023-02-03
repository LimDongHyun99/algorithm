import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
        String t1 = sc.next();
        String t2 = sc.next();
        try {
            Date date1 = format.parse(t1);
            Date date2 = format.parse(t2);

            long time = date2.getTime() - date1.getTime();
            if (time == 0) {
                System.out.println("24:00:00");
            } else {
                System.out.println(format.format(time));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}