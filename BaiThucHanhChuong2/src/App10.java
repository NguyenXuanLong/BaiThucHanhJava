import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kitu;
        int dem = 0;
        do {
            System.out.print("Nhap vao mot chuoi bat ky : ");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);
        System.out.print("Nhap vao mot ki tu : ");
        kitu = sc.next().charAt(0);
        char a[] = chuoi.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == kitu) {
                dem++;
            }
        }
        System.out.println("Co " + dem + " ki tu " + kitu + " trong chuoi ");
    }
}