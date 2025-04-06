import java.util.Arrays;
import java.util.List;

    public class StreamExam4 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
            boolean allEven = numbers.stream()
                    .allMatch(n -> n % 2 == 0);
            if (allEven) {
                System.out.println("Butun ededler cutdur.");
            } else {
                System.out.println("Siyahida tek eded de var.");
            }
        }
    }


