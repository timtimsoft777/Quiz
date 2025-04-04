import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "apple"};
        HashMap<String, Integer> countMap = new HashMap<>();


        for (String fruit : fruits) {
            countMap.put(fruit, countMap.getOrDefault(fruit, 0) + 1);
        }


        String mostRepeated = null;
        int max = 0;

        for (String key : countMap.keySet()) {
            int count = countMap.get(key);
            if (count > max) {
                max = count;
                mostRepeated = key;
            }
        }

        System.out.println("Ən çox təkrarlanan: " + mostRepeated + " (" + max + " dəfə)");
    }
}
