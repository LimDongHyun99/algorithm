import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int count = 0;
            String str = br.readLine();
            if (str.equals("0")) { break; }
                for(int i = 0; i < str.length(); i++) {
                    String str1 = str.substring(i, i + 1);
                    if(str1.equals("1")) {
                        count += 3;
                    } else if(str1.equals("0")) count +=5 ;
                    else count += 4;
                }
            System.out.println(count + 1);
            }
        }
    }