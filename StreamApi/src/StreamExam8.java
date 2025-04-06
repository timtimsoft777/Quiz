import java.util.Arrays;
import java.util.List;

public class StreamExam8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

        long count = list.stream()
                .filter(word -> word.length() > 5)
                .count();

        System.out.println("Uzunlugu 5-den boyuk sozlerin sayi: " + count);
    }
}
