import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String ten;
        int namsinh;
        System.out.print("Nhap ten cua ban: ");
        ten = sc.nextLine();
        System.out.print("Nhap nam sinh cua ban: ");
        namsinh = sc.nextInt();
        if(2022-namsinh<16){
            System.out.println("Ban "+ten+" o do tuoi vi thanh nien");
        }else if((2022-namsinh>=16) && (2022-namsinh<18)){
            System.out.println("Ban "+ten+" o do tuoi truong thanh");
        }else{
            System.out.println("Ban "+ten+" da gia");
        }
    }    
}
