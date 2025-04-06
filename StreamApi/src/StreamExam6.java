import java.util.*;
import java.util.stream.Collectors;

public class StreamExam6 {
        public static void main(String[] args) {
            Map<String, List<Integer>> data = Map.of(
                    "A", List.of(1, 2, 3),
                    "B", List.of(4, 5),
                    "C", List.of(6, 7, 8, 9)
            );
            Map<String, List<Integer>> evenData = data.entrySet().stream()
                    .collect(Collectors.toMap(
                            entry -> entry.getKey(),
                            entry -> entry.getValue().stream()
                                    .filter(n -> n % 2 == 0)
                                    .collect(Collectors.toList())
                    ));

            System.out.println("Yalniz cut ededlerle yeni map: " + evenData);
        }
    }


