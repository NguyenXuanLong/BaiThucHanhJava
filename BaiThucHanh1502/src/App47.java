import java.util.Scanner;
public class App47 {
  public static void main(String[] args) {
    int a, sum = 0;
    Scanner sc = new Scanner(System.in);      
    do{
        System.out.print("Nhap vao so nguyen bat ky: ");
        a = sc.nextInt();
        sum += a;
    } while (sum < 100); 
        System.out.print("Tong cac so nguyen vua nhap = "+sum);

    }
}