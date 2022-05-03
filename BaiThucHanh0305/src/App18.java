import java.util.Iterator;
import java.util.ArrayList;

public class App18 {
    public static void main(String[] args) {
        ArrayList<Float> arrListFloat = new ArrayList<>();

        arrListFloat.add(0.7f);
        arrListFloat.add(4.23f);
        arrListFloat.add(2.65f);
        arrListFloat.add(9.3f);

        Iterator<Float> iterator = arrListFloat.iterator();

        System.out.println("Cac phan tu co trong arrlistFloat");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
    }
}
