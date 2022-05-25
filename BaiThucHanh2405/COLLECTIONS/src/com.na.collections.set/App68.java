import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class App68 {
    public static void main(String[] arg) {
        int number;
        TreeSet<Integer> treeSI = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua TreeSet : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " : ");
            number = sc.nextInt();
            treeSI.add(number);

        }
        System.out.println("Cac phan tu trong treeInteger : ");
        System.out.println(treeSI);
        int a;
        System.out.print("Nhap a : ");
        a = sc.nextInt();
        if (!treeSI.contains(a)) {
            treeSI.add(a);
            System.out.println("Them thanh cong !");
            System.out.println("Cac phan tu sau khi them : ");
            System.out.print(treeSI);
        } else {
            System.out.println("Da ton tai " + a + " !");
        }
    }
}
