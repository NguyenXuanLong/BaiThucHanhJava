import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=1 , max= 0;
        while(a!=0){
            System.out.print("Nhap so thuc a = ");
            a = sc.nextInt();
            if (max < a)
                max = a;
        }
        System.out.print("So lon nhat = "+max);
    }
}