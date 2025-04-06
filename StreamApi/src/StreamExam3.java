import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam3 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("java", "stream", "API");


            List<String> upperWords = words.stream()
                    .map(word -> word.toUpperCase())
                    .collect(Collectors.toList());

            System.out.println("Boyok herflerle sozler: " + upperWords);
        }
    }


