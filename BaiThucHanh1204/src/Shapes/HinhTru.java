package Shapes;
import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru(){
        ten = "Hinh Tru";
    }

    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.print("Chieu cao =");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
    
}
