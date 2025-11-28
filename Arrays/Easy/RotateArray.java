package Arrays.Easy;
import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 3, 4, 9, 0 };
        System.out.println("Original Array");
        System.out.println(Arrays.toString(nums));
        System.out.println("After rotating");
        rotateArray(nums);
    }

    public static void rotateArray(int[] nums) {
        int[] rotated = new int[nums.length];
        rotated[0] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            rotated[i] = nums[i - 1];
        }

        System.out.println(Arrays.toString(rotated));
    }
}
