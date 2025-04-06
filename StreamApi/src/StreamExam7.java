import java.util.*;
import java.util.stream.Collectors;

    public class StreamExam7 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot");
            Map<Character, List<String>> grouped = words.stream()
                    .collect(Collectors.groupingBy(word -> word.charAt(0)));

            System.out.println("Bash herfe gore qruplashdirilmish: " + grouped);
        }
    }

