import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Hinhtron ht  =  new Hinhtron();
        
        ht.nhapBanKinh();
        ht.tinhChuvi();
        ht.tinhDienTich();
        ht.inChuvi();
        ht.inDientich();
        
    } 
}
    class Hinhtron {

        final float PI =3.14f;
        float r;
        float cv;
        float dt;
        void nhapBanKinh(){
            System.out.println("Hay nhap ban kinh hinh tron");
            Scanner scanner = new Scanner(System.in);
            r= scanner.nextFloat();
        }

        void tinhChuvi(){
            cv = 2*PI * r;
        }
        void tinhDienTich(){
            dt= PI *r*r;
        }
        void inChuvi(){
            System.out.println("Chu vi Hinh Tron : "+cv);
        }
        void inDientich(){
            System.out.println("Dien tich Hinh Tron : " + dt);
        }
    
}
