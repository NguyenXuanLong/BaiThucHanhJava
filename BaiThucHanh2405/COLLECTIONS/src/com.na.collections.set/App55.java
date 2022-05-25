import java.util.HashSet;
import java.util.Scanner;

public class App55 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hsS = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua HashSet : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            
            name = sca.nextLine();
            hsS.add(name);
        }
        System.out.println("Cac phan tu trong hashSetString : ");
        System.out.println(hsS);
        System.out.println("Nhap phan tu can xoa :");
        String a;
        System.out.print("Nhap a : ");
        a = sca.nextLine();
        if (hsS.contains(a)) {
            hsS.remove(a);
            System.out.println("Xoa thanh cong !");
            System.out.println("Cac phan tu con lai trong hashSetString : ");
            System.out.print(hsS);
        } else {
            System.out.println("Xoa khong  thanh cong !");
        }
    }
}
