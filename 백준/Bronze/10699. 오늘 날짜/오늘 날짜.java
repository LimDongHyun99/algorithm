    import java.io.IOException;
    import java.text.SimpleDateFormat;
    import java.util.Date;

    public class Main {
        public static void main(String[] args) throws IOException {
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            System.out.println(simpleDateformat.format(date));
        }
    }