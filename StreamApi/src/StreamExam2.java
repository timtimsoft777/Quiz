import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamExam2 {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> squaredOdds = numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .map(n -> n * n)
                    .collect(Collectors.toList());

            System.out.println("Tek ededlerin kvadratlari: " + squaredOdds);
        }
    }


