import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //doi tuong su dung de nhap xuất du lieu trong java
        Scanner sc = new Scanner(System.in);
        //khai báo biến double
        double heSoA,heSoB,heSoC, x1, x2,delta;
        //in ra thng bao cho ng dung biét
        System.out.print("Nhap he so A = ");
        heSoA= sc.nextDouble();

        System.out.print("Nhap he so B = ");
        heSoB = sc.nextDouble();

        System.out.print("Nhap he so C = ");
        heSoC = sc.nextDouble();

        delta = (heSoB * heSoB - (4 * heSoA * heSoC)) / (2 * heSoA);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x1 = x2 = (-heSoB / (2 * heSoA));
            System.out.println("Phuong trinh co nghiem kep x1 = x2= " + x1);
        } else {
            x1 = (float) ((-heSoB + Math.sqrt(delta)) / (2 * heSoA));
            x2 = (float) ((-heSoB - Math.sqrt(delta)) / (2 * heSoA));
            System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
        }
    }
}