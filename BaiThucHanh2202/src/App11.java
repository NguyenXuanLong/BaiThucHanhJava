import java.util.Scanner;

public class App11 {
    public static void main(String[] args) throws Exception {
        int socach = 0;
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 4; k++)
                    if (i * 10 + j * 20 + k * 50 == 200) {
                        System.out.println(i + " to10000   " + j + " to20000   " + k + "  to50000");
                        socach++;
                    }
            }
        }
        System.out.println("Co tat ca " + socach + " phuong an");
    }
}
