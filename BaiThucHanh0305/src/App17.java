import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();

        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(3);
        arrListInteger.add(8);

        System.out.println("Cac phan tu co trong mang arrListString la:");
        for (int number : arrListInteger) {
            System.out.println(number + "\t");
        }

    }
}
