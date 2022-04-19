package People;

import java.util.Scanner;
public class Person {

    private String ten;
    private int tuoi;

    public Person(String ten, int tuoi) {
        this.ten = ten;  
        this.tuoi = tuoi;
    }
    public void setten(String ten) {
        this.ten = ten;
    }
    public String  getten() {
        return ten;
    }
    public void setten(int tuoi) {
        this.tuoi = tuoi;
    }
    public int gettuoi() {
        return tuoi;
    }
    public void xuatthongtin() {
        System.out.println("Tên : " + ten);
        System.out.println("tuoi: " + tuoi);
    }
}
