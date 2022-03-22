import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
      

    }
}

class Sinhvien {
    String MaSinhVien;
    String HoTen;
    Boolean gioiTinh;
    String Diachi;
    String NgaySinh;

    void nhapMaSinhVien() {
        System.out.println("Hay nhap Ma Sinh Vien ");
        Scanner scanner = new Scanner(System.in);
        MaSinhVien = scanner.nextLine();
    }

    void nhapHoTen() {
        System.out.println("Hay nhap Ho Ten ");
        Scanner scanner = new Scanner(System.in);
        HoTen = scanner.nextLine();
    }

    void nhapgioiTinh() {
        System.out.println("Hay nhap gioi tinh ");
        Scanner scanner = new Scanner(System.in);
        gioiTinh = scanner.nextBoolean();

    }

    void nhapDiaChi() {
        System.out.println("Hay nhap Dia chi  ");
        Scanner scanner = new Scanner(System.in);
        Diachi = scanner.nextLine();
    }

    void nhapNgaysinh() {
        System.out.println("Hay nhap ngay sinh  ");
        Scanner scanner = new Scanner(System.in);
        NgaySinh = scanner.nextLine();

    }

    void inMaSinhVien() {
        System.out.println("Ma sinh vien cua ban la " + MaSinhVien);
    }

    void inHoTen() {
        System.out.println("Ho ten cua ban la " + HoTen);
    }

    void ingioiTinh() {
        System.out.println("Gioi tinh cua ban la " + gioiTinh);
    }

    void inDiaChi() {
        System.out.println("Dia chi cua ban la " + Diachi);
    }

    void inNgaySinh() {
        System.out.println("Ngay sinh cua ban la " + NgaySinh);
    }

}
