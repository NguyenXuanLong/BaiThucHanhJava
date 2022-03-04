import java.util.Scanner;

public class App8 {
    public static void main(String[] args) throws Exception {
        int n, sum=0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu day so nguyen : ");
        n = sc.nextInt();
        
        System.out.println("Nhap cac phan tu cho mang: ");
        for(int i=1;i<=n;i++){
            System.out.print("Nhap phan tu thu "+i + ": ");
           num= sc.nextInt();
            sum += num;
        }
        float tbc =(float) sum/n;
        System.out.print("Trung binh cong cua day so vua nhap = "+tbc);
    } 
}

