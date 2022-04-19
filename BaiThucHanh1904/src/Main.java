import People.Person;
import People.Student;
import People.OnlineStudent;
import People.OfflineStudent;
import People.Customer;
import People.VIPCustomer;
import People.Employee;
import People.FullTimeEmployee;
import People.PartTimeEmployee;
import java.util.Scanner;

public class Main {
     public static void main(String[] args){
        Person per = new Person("Long", 20);
        Student stu = new Student("Long",20,"CNTT");
        OfflineStudent off = new OfflineStudent("Long",20,"Offline");
        OnlineStudent onl = new OnlineStudent("Trang", 20,"Online");
        Customer cus = new Customer("Nam", 18, "Dien thoai");
        VIPCustomer vip = new VIPCustomer("Nga", 18, "Giảm giá");
        Employee emp = new Employee("Emp", 18, "dai hoc");
        PartTimeEmployee part = new PartTimeEmployee("Pt",18, "khong",50 );
        FullTimeEmployee full = new FullTimeEmployee("Ft",18,"Cao dang",30);
        per.xuatthongtin();
        stu.xuatthongtin();
        off.xuatthongtin();
        onl.xuatthongtin();
        cus.xuatthongtin();
        vip.xuatthongtin();
        emp.xuatthongtin();
        part.xuatthongtin();
        full.xuatthongtin();
        
    }
}


