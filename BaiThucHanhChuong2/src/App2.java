import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        if(a % 2==0){
            System.out.println(a+" la so chan");
        }else{
            System.out.println(a + " la so le");
        }
    }
    
}
