import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class Exam6 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(3, 9, 12, 16, 17, 21, 5, 8, 27);
            List<Integer> filtered = numbers.stream()
                    .filter(n -> n > 10 && n % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println("Nəticə: " + filtered);
        }
    }

