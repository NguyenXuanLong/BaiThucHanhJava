package People;

import java.util.Scanner;
public class OnlineStudent extends Person {
    private String online;
    public OnlineStudent(String ten, int tuoi, String offline) {
        super(ten, tuoi);
        this.online = online;
    }

    public void setDiemDanh(String online) {
        this.online = online;
    }

    public String getDiemDanh() {
        return online;
    }

    @Override
    public void xuatthongtin() {
        super.xuatthongtin();;
        System.out.println("Diem danh: " + online);
    }

}
