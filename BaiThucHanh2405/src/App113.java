import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class App113 {
    public static void main(String[] args){
        String tc;
        HashSet<String> traicay = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang traicay :");
        int n =sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu " + i + " : ");
            tc = sca.nextLine();
            traicay.add(tc);
        }
        System.out.println(traicay);
        String a;
        System.out.println("Nhap a :");
        a = sca.nextLine();
        
        if (traicay.contains(a)) {
            System.out.println("Da co "+a+" trong HashSet");
        }else{
            System.out.println("Chua co " + a + " trong HashSet");
        }
        if (traicay.contains("nhan")) {
            System.out.println("Co nhan trong HashSet--- Xoa nhan khoi HashSet");
            traicay.remove("nhan");
        } else {
            System.out.println("Khong co nhan trong HashSet");
        }
        System.out.println(traicay);

        HashSet<String> fruit = new HashSet<>();
        System.out.println("Nhap vao so phan tu cua mang fruit:");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            tc = sca.nextLine();
            fruit.add(tc);
        }
        System.out.println(fruit);
        traicay.addAll(fruit);
        System.out.println("Cac phan tu duoc them vao traicay la:");
        Iterator<String> iterator = traicay.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        traicay.removeAll(fruit);
        System.out.println("\n");
        System.out.println("Cac phan tu con lai trong traicay sau khi xoa: "+traicay);
    }    
}
