import java.util.ListIterator;
import java.util.ArrayList;

public class App19 {
    public static void main(String[] args) {
        ArrayList<Character> arListChar = new ArrayList<>();

        arListChar.add('a');
        arListChar.add('e');
        arListChar.add('b');
        arListChar.add('c');

        ListIterator<Character> listIterator = arListChar.listIterator();

        System.out.println("Cac phan tu co trong arrlistChar la :");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next()+"\t");
        }
    }
}
