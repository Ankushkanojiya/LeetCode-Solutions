public class MinimumOperationsDivisibleThree {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,7,71};
        System.out.println(minimumOperations(nums));
    }
    public static int minimumOperations(int[] nums){
        int operation=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 !=0) {
                operation++; // I have to do one operation if we have to make it divisible;
            }
        }
        return operation;
    }
}
