import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam5 {
        public static void main(String[] args) {
            List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
            String result = nums.stream()
                    .map(n -> String.valueOf(n))
                    .collect(Collectors.joining(","));

            System.out.println("Netice: " + result);
        }
    }


