import java.util.ArrayList;
import java.util.Scanner;

public class AppArr {
    public static void NhanVien(String[] args) {
        NhanVien nv1 = new NhanVien("Nhan vien 1","ngfgf","ghfgf");
        NhanVien nv2 = new NhanVien("Nhan vien 1", "ngfgf", "ghfgf");
        NhanVien nv3 = new NhanVien("Nhan vien 1", "ngfgf", "ghfgf");
        ArrayList<NhanVien> nvien = new ArrayList<NhanVien>();
        nvien.add(nv1);
        nvien.add(nv2);
        nvien.add(nv3);
        showList(nvien);
    
    }
    public static void showList(ArrayList<String> nvien){
        for( String obj : nvien){
            System.out.println(obj);
        }
        System.out.println();
    }   
}
