import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<String> convat = new ArrayList<String>();

        convat.add("Cho");
        convat.add("Meo");
        convat.add("Chim");
        convat.add("Ca");
        convat.add("Bo");
        convat.add("Tho");

        System.out.println(convat);
        System.out.println("Cac phan tu co trong mang convat la:");
        for( int i = 1; i< convat.size();i++){
        System.out.println(convat.get(i));
        }
        convat.set(5, "Khi");
        System.out.println("Cac phan tu co trong mang convat sau khi thay doi gia tri la:");
        for (int i = 1; i < convat.size(); i++) {
            System.out.println(convat.get(i) );
        }
    }
}
