package GBJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkSeminar3Task2 {


    public static void main(String[] args) {
        calculateTheExpression(" 2? ? +  ?5   ?        = 693");
    }

    static void calculateTheExpression(String Expression) {
        Expression = Expression.replace(" ", "");
        char[] arrayChars = Expression.toCharArray();
        int count = 0;
        List<Integer> arrayposition = new ArrayList<Integer>();
        for (int i = 0; i < arrayChars.length; i++) {
            if (arrayChars[i] == '?') {
                arrayposition.add(i);
                count++;
            }
        }
        System.out.println(searchResult(arrayChars, arrayposition, (combine(9, count))));
    }

    static List<String> searchResult(char[] array, List<Integer> position, List<List<Integer>> combine) {
        List<String> b = new ArrayList<>();
        for (List<Integer> res : combine) {
            for (int i = 0; i < position.size(); i++) {
                array[position.get(i)] = Character.forDigit(res.get(i), 10);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(array));
            String[] result = (sb.toString().replace("+", "=")).split("=");
            if (Integer.parseInt(result[0]) + Integer.parseInt(result[1]) == Integer.parseInt(result[2])) {
                b.add(Arrays.toString(result));
            }
        }
        return b;
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (k < 0 || k > n) {
            return res;
        }
        if (k == 0) {
            res.add(new ArrayList<Integer>());
            return res;
        }
        res = combine(n, k - 1);
        for (List<Integer> list : res) {
            list.add(n);
        }
        res.addAll(combine(n - 1, k));
        return res;
    }
}
