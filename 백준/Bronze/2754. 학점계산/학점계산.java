import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String grade = br.readLine();
        double result = 0;
        switch (grade) {
            case "A+" :
                result = (double) 4.3;
                break;
            case "A0" :
                result = (double) 4.0;
                break;
            case "A-" :
                result = (double) 3.7;
                break;
            case "B+" :
                result = (double) 3.3;
                break;
            case "B0" :
                result = (double) 3.0;
                break;
            case "B-" :
                result = (double) 2.7;
                break;
            case "C+" :
                result = (double) 2.3;
                break;
            case "C0" :
                result = (double) 2.0;
                break;
            case "C-" :
                result = (double) 1.7;
                break;
            case "D+" :
                result = (double) 1.3;
                break;
            case "D0" :
                result = (double) 1.0;
                break;
            case "D-" :
                result = (double) 0.7;
                break;
            case "F" :
                result = (double) 0.0;
                break;
            default: break;
        }
        System.out.println(result);
    }
}