import java.util.HashMap;
import java.util.Map;

    public class Exam2 {
        public static void main(String[] args) {
            String input = "alma";
            countCharacters(input);
        }

        public static void countCharacters(String str) {
            Map<Character, Integer> charCountMap = new HashMap<>();

            for (char c : str.toCharArray()) {

                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


