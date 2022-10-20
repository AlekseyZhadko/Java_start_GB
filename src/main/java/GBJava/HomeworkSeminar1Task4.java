package GBJava;

public class HomeworkSeminar1Task4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end){
            while (!Character.isLetterOrDigit(s.charAt(start))) {
                start += 1;
            }
            while (!Character.isLetterOrDigit(s.charAt(end))) {
                end -= 1;
            }
            char simbol1 = Character.toLowerCase(s.charAt(start));
            char simbol2 = Character.toLowerCase(s.charAt(end));
            if (simbol1 != simbol2) return false;
            start+=1;
            end-=1;
        }
        return true;
    }
}
