public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={3,2,5,1,8,6};
        insertionSort(nums);
        for (int i : nums) {
            System.out.print(i +" ");
        }

    }

    public static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int key=nums[i];
            int j=i-1;

            while ( j >=0 && nums[j] > key ) {
                nums[j+1]=nums[j];
                j--;
            }

            nums[j+1] = key;
        }
    }
}
