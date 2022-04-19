package People;

import java.util.Scanner;
public class PartTimeEmployee extends Person {
    private int gioLamViec;

    public PartTimeEmployee(String ten, int tuoi, String bangcap, int gioLamViec) {
        super(ten, tuoi);
        this.gioLamViec = gioLamViec;
       }
    public void setGioLam(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public int getGioLam() {
        return gioLamViec;
    }

    @Override
    public void xuatthongtin() {
        super.xuatthongtin();
        System.out.println("Gio lam: " + gioLamViec);
    }
    
}
