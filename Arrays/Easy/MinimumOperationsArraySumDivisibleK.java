package Arrays.Easy;

public class MinimumOperationsArraySumDivisibleK {
    public static void main(String[] args) {
        int [] nums={3,6,3,5};
        int k=5;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum+=nums[i];
        }
        System.out.println(sum % k);
    }
}
