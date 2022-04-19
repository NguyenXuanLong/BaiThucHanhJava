package People;

import java.util.Scanner;
public class Customer extends Person {
    private String sanphamdat;

    public Customer(String ten, int tuoi, String sanphamdat) {
        super(ten, tuoi);
        this.sanphamdat = sanphamdat;
    }

    public void setsanpham() {
        this.sanphamdat = sanphamdat;
    }

    public String getsanpham() {
        return sanphamdat;
    }

    @Override
    public void xuatthongtin() {
        super.xuatthongtin();
        System.out.println("san phham : " + sanphamdat);
    }
}
