package GBJava;


import java.util.HashMap;
import java.util.Map;

public class HomeworkSeminar5Task2 {
    public static void main(String[] args) {
        String[] words1 = new String[]{"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = new String[]{"amazing", "leetcode", "is"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String word : words1) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }
        for (String word : words2) {
            if (map.containsKey(word) && map.get(word)<=1) {
                map.put(word, map.get(word) - 1);
            }
        }
        int count = 0;
        for (var entry : map.entrySet()) {
            if (entry.getValue()==0){
                count++;
            }
        }
        return count;
    }
}
