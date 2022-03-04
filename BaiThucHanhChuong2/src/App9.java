
import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi bat ky :");
        String chuoi = sc.nextLine();
        int demso = 0, demkytuhoa = 0, demkytuthuong = 0;
        int dodai = chuoi.length();
        for (int i = 0; i < dodai; i++) {
            if (Character.isUpperCase(chuoi.charAt(i))) {
                demkytuhoa++;
            }
            if (Character.isLowerCase(chuoi.charAt(i))) {
                demkytuthuong++;
            }
            if (Character.isDigit(chuoi.charAt(i))) {
                demso++;
            }
        }
        System.out.println("Chuoi vua nhap co :");
        System.out.println( demkytuhoa + " ki tu in hoa");
        System.out.println(  demkytuthuong + " ki tu thuong");
        System.out.println(  demso + " ki tu so");
    }
}
