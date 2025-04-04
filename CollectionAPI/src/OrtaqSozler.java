import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

    public class OrtaqSozler {
        public static void main(String[] args) {
            List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
            List<Integer> list2 = Arrays.asList(3, 4, 5, 6);


            List<Integer> common = new ArrayList<>(list1);


            common.retainAll(list2);

            System.out.println("Ortaq elementlər: " + common);
        }
    }


