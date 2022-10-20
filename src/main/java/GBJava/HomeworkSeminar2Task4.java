package GBJava;

public class HomeworkSeminar2Task4 {
    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }

    static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

}


