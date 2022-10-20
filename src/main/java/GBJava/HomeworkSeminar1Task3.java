package GBJava;

public class HomeworkSeminar1Task3 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    static String reverseWords(String s) {
        int k = 0;
        if (s.charAt(0) == ' ') {
            while (s.charAt(k) == ' ') {
                k++;
            }
        }
        int start = 0;
        int end = 0;
        StringBuilder sb = new StringBuilder();
        s = s.substring(k);
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                end = i + 1;
                while (s.charAt(i) != ' ' && i != 0) {
                    i--;
                }
                if (i == 0) {
                    start = i;
                    sb.append(s.substring(start, end));
                } else {
                    start = i + 1;
                    sb.append(s.substring(start, end) + ' ');
                }
            }
        }
        return sb.toString();
    }
}
