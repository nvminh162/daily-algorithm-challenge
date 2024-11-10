import java.util.Arrays;

public class _1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                 if(nums[i] + nums[j] == target) {
                     result[0] = i;
                     result[1] = j;
                     return result;
                 }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoSum(arr, 8)));
    }
}
