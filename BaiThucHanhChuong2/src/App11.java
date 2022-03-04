import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        int num, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang : ");
        num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Nhap vao cac phan tu cua mang:");
        for (i = 0; i < num; i++)
            array[i] = sc.nextInt();
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Mang sap xep theo thu tu tang dan la: ");
        for (i = 0; i < num; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}