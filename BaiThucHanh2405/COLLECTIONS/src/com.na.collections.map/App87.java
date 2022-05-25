import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class App87 {
    public static void main(String[] args) {
        HashMap<String, String> hasMapCity = new HashMap<>();
        hasMapCity.put("QN", "Quang Ngai");
        hasMapCity.put("QN", "Quang Nam");
        hasMapCity.put("QN", "Quang Ninh");
        hasMapCity.put("HCM", "Ho Chi Minh");

        System.out.println("Danh sach cac thanh pho trong hasMapCity: ");
        Set<Map.Entry<String, String>> setCity = hasMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QN" + hasMapCity.get("QN"));
        System.out.println("NT" + hasMapCity.get("NT"));
        if (hasMapCity.containsValue("Thanh pho Ho Chi minh"))
            ;
        System.out.println("Co thanh pho Ho Chi Minh trong hasMapCity");
    }
}