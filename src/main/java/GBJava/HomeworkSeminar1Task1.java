package GBJava;

public class HomeworkSeminar1Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 5, 3, 4};
        arr = BuildArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    static int[] BuildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
