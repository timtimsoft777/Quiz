

import java.util.ArrayList;
import java.util.Arrays;

public class Exam1 {
        public static void main(String[] args) {
            ArrayList<String> words = new ArrayList<>(Arrays.asList(
                    "alma", "nar", "banan", "kivi", "ananas", "armud"
            ));

            String longest = findLongest(words);
            System.out.println("Ən uzun söz: " + longest);
        }

        public static String findLongest(ArrayList<String> list) {
            String longest = "";

            for (String word : list) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            return longest;
        }
    }

