package People;

import java.util.Scanner;
public class FullTimeEmployee extends Person{
    private int ngaylamviec;

    public FullTimeEmployee(String ten, int tuoi, String bangcap, int gioLamViec) {
        super(ten, tuoi);
        this.ngaylamviec = ngaylamviec;
       }

    public void setGioLam(int gioLamViec) {
        this.ngaylamviec = ngaylamviec;
    }

    public int getGioLam() {
        return ngaylamviec;
    }

    @Override
    public void xuatthongtin() {
        super.xuatthongtin();
        System.out.println("Gio lam: " + ngaylamviec);
    }
    
}
