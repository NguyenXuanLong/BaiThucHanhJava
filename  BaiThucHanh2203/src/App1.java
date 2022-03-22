import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        

    }
}

class Hinhchunhat {

    float chieudai;
    float chieurong;
    float cv;
    float dt;

    void nhapchieudai() {
        System.out.println("Hay nhap chieu dai cua hinh chu nhat");
        Scanner scanner = new Scanner(System.in);
        chieudai = scanner.nextFloat();
    }

    void nhapchieurong() {
        System.out.println("Hay nhap chieu rong cua hinh chu nhat");
        Scanner scanner = new Scanner(System.in);
        chieurong = scanner.nextFloat();
    }

    void tinhChuvi() {
        cv = 2 * (chieudai + chieurong);
    }

    void tinhDienTich() {
        dt = chieudai * chieurong;
    }

    void inChuvi() {
        System.out.println("Chu vi Hinh Chu Nhat : " + cv);
    }

    void inDientich() {
        System.out.println("Dien tich Hinh Chu Nhat : " + dt);
    }

}
