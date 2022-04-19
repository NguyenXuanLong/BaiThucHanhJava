package People;

import java.util.Scanner;
public class Employee extends Person {
    private String bangcap;

    public Employee(String ten, int tuoi, String bangcap) {
        super(ten, tuoi);
        this.bangcap = bangcap;
    }
    
    public void setbangcap(String bangcap) {
        this.bangcap =bangcap;
    }
    public String getbangcap() {
        return bangcap;
    }
    @Override
    public void xuatthongtin() {
        super.xuatthongtin();
        System.out.println("bằng cấp: " + bangcap);
    }
}
    

