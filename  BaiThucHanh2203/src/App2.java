import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
      

    }
}
     class Person{
        String PersonID;
        String PersonName;
        Boolean Gender;
        String Address;
    
        void nhapPersonID(){
            System.out.println("Hay nhap PersonID ");
            Scanner scanner = new Scanner(System.in);
            PersonID = scanner.nextLine();
        }
        void nhapPersonName() {
            System.out.println("Hay nhap PersonName ");
            Scanner scanner = new Scanner(System.in);
            PersonName = scanner.nextLine();
        }
        void nhapGender() {
            
            System.out.println("Hay nhap Gender ");
            Scanner scanner = new Scanner(System.in);
            Gender = scanner.nextBoolean();
        }
        void nhapAddress() {
            System.out.println("Hay nhap Address ");
            Scanner scanner = new Scanner(System.in);
            Address = scanner.nextLine();
        }
        void inPersonID() {
            System.out.println("PersonID cua ban la : " + PersonID);
        }
        void inPersonName() {
            System.out.println("PersonName cua ban la : " + PersonName);
        }
        void inGender() {
            System.out.println("Gender cua ban la : " + Gender);
        }
        void inAddress() {
            System.out.println("Address cua ban la : " + Address);
        }
    }
