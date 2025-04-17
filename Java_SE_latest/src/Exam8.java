import java.util.Map;
import java.util.TreeMap;
    public class Exam8 {
        public static void main(String[] args) {
            TreeMap<Integer, String> map = new TreeMap<>();
            map.put(5, "Beş");
            map.put(2, "İki");
            map.put(8, "Səkkiz");
            map.put(1, "Bir");
            map.put(3, "Üç");
            System.out.println("TreeMap (açarlar artan sırada):");
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
