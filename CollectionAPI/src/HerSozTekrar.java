import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
    public class HerSozTekrar {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("a", "b", "a", "c", "b", "a");

            HashMap<String, Integer> countMap = new HashMap<>();


            for (String word : list) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }


            for (String key : countMap.keySet()) {
                System.out.println(key + " -> " + countMap.get(key) + " dəfə");
            }
        }
    }


