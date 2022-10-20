package GBJava;

public class HomeworkSeminar1Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(arr, 3));
    }

    static int removeElement(int[] nums, int val) {
        int CopyInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[CopyInd] = nums[i];
                CopyInd++;
            }
        }
        return CopyInd;
    }
}
