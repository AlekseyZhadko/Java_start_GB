package GBJava;

import java.util.*;

public class HomeworkSeminar5Task1 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 3};
        int[] nums2 = new int[]{1, 2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums1) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }
        List<Integer> answer = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num)>0) {
                answer.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
