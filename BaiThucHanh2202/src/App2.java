import java.util.Scanner;
public class App2 {
        public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("Nhap a = ");
        a = sc.nextFloat();
        System.out.print("Nhap b = ");
        b = sc.nextFloat();
        System.out.print("Nhap c = ");
        c = sc.nextFloat();
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Day la tam giac thuong !");
		}
		else if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Day la tam giac can !");
		} else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("Day la tam giac deu !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Day la tam giac vuong !");
		}else if((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==b*b+a*a)&&(a==b)||(b==c)||(c==a)){
			System.out.println("Day la tam giac vuong can !"); 
        }else {
			System.out.println("Day khong phai tam giac");
		}
	}
        
}    
   


