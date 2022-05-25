import java.util.HashSet;
import java.util.Scanner;

public class App53 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hsI = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua HashSet : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " : ");
            number = sc.nextInt();
            hsI.add(number);
        }
        System.out.println("Cac phan tu trong hashSetInteger : ");
        System.out.println(hsI);
        int a;
        System.out.print("Nhap a : ");
        a = sc.nextInt();
        if (!hsI.contains(a)) {
            hsI.add(a);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong hashSetInteger sau khi add : ");
            System.out.println(hsI);
        } else {
            System.out.println("Phan tu " + a + " da ton tai");
        }
    }
}
