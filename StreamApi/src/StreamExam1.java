import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamExam1 {

        public static void main(String[] args) {

            List<String> names = Arrays.asList("Ali", "Aysel", "Nigar", "Eli");

            List<String> filteredNames = names.stream()
                    .filter(name -> name.startsWith("A"))
                    .collect(Collectors.toList());

            System.out.println("A ile bashlayan adlar: " + filteredNames);
        }
    }


