import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();
        //1. Tính tổng, hiệu, tích, thương, phần dư
        System.out.println("Tong hai so a va b = "+a + " + " + b + " = " + (a + b));
        System.out.println("Hieu hai so a va b = " +a + " - " + b + " = " + (a - b));
        System.out.println("Tich hai so a va b = " +a + " * " + b + " = " + (a * b));
        System.out.println("Thuong hai so a va b = " +a + " / " + b + " = " + ((float) a / b));
        System.out.println("Phan du cua thuong hai so a va b = " + a + " % " + b + " = " +  (a % b));
        //2. So sánh 2 số
        if(a==b){
            System.out.println("a và b  bang nhau");
        }else if(a>b){
            System.out.println("a lon hon b");
        }else{
            System.out.println("a nho hon b"); 
        }
    }
}
