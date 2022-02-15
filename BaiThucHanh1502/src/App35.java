import java.util.Scanner;
public class App35 {
    public static void main(String[] args){
        int sothunhat, sothuhai;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so thu nhat: ");
        sothunhat = scanner.nextInt();
        System.out.print("Nhap vao so thu hai: ");
        sothuhai = scanner.nextInt();
        int sonhonhat = sothunhat;

        if (sothunhat > sothuhai) {
            sonhonhat = sothuhai;}
            System.out.println("So nho nhat trong hai so " + sothunhat + " va " + sothuhai+ " la " + sonhonhat);

    }

}