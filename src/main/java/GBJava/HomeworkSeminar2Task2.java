package GBJava;

public class HomeworkSeminar2Task2 {
    public static void main(String[] args) {
        System.out.println(myPow(0.00001, 2147483647));
    }

    static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (x == 0) return 0;
        double p = myPow(x, n / 2);
        if (n % 2 == 0) {
            return p * p;
        } else if (n % 2 == 1) {
            return p * p * x;
        } else {
            return 1 / myPow(x, -n);
        }
    }
}
