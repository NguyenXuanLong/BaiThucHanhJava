package People;

import java.util.Scanner;
public class VIPCustomer  extends Person {
    private String quyenloi;

    public VIPCustomer(String ten, int tuoi, String quyenloi) {
        super(ten, tuoi);
        this.quyenloi = quyenloi;
    }
    public void setquyenloi(String quyenloi) {
        this.quyenloi = quyenloi;
    }
    public String getbangcap() {
        return quyenloi;
    }  
    @Override
    public void xuatthongtin() {
        super.xuatthongtin();
        System.out.println("quyen loi : " + quyenloi);
    }
}   
