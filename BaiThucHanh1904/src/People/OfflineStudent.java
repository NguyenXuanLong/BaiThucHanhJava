package People;

import java.util.Scanner;
public class OfflineStudent extends Person {
    private String offline;
    public OfflineStudent( String ten, int tuoi, String offline) {
        super(ten, tuoi);
        this.offline = offline;
    }
    public void setDiemDanh(String offline) {
        this.offline = offline;
    }
    public String getDiemDanh(){
        return offline;
    }
    @Override
    public void xuatthongtin() {
        super.xuatthongtin();
        System.out.println("Diem danh: " + offline);
    }

}