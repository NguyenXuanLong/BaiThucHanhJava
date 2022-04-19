package People;

import java.util.Scanner;
public class Student extends Person {
    private String lop;

    public Student(String ten, int tuoi, String lop) {
        super(ten, tuoi);
        this.lop = lop;
    }
    
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getLop() {
        return lop;
    }
    
    @Override
    public void xuatthongtin() {
        super.xuatthongtin();
        System.out.println("Lop: " + lop);
    }
}
