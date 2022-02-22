import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so duong a = ");
        int a = sc.nextInt();
        if( a<=1){
            System.out.println(a + " khong phai so nguyen to");
        }
        int sum = 0;
        for(int i =2 ; i < a; i++){
            if(a % i == 0){
            sum+= i;
            }
        }
        if(sum == 0){
            System.out.println( a+" la so nguyen to");
        }else{
        System.out.println(a + " khong phai so nguyen to" );
        }
    }
}
