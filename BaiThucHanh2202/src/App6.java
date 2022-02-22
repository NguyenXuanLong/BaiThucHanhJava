import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App6 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap n: ");
        String n = kbd.readLine();
        int b = Integer.parseInt(n);
        System.out.println("Cac so hoan thien nho hon " + n + " là:");
        for (int i = 1; i < b; i++) {
            int tong = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    tong += j;
            }
            if (i == tong) {
                
                System.out.println(i);
            }
        }

    }
}
