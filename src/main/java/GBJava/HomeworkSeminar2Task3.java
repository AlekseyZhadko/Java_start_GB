package GBJava;

public class HomeworkSeminar2Task3 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }

    static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        } else {
            return false;
        }
    }
}
