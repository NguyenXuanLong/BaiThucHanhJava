package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat(){
        ten = "Hinh Chu Nhat";
    }

    public void nhapChieuDai() {
        System.out.print("Chieu dai = ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }
    
    public void nhapChieuRong() {
        System.out.print("Chieu rong = ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2 *(dai + rong);
    }
    public void tinhDienTich(){
        dienTich = dai * rong;
    }
}
    

