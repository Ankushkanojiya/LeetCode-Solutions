package Arrays.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 6, 2, 1 };
        int n = nums.length;
        selectionSort(nums, n);
        System.out.println("after sorting");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] nums, int n) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }

            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

    }

}
