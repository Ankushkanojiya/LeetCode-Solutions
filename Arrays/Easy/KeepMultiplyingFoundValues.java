import java.util.HashSet;

public class KeepMultiplyingFoundValues {
    public static void main(String[] args) {
        
        int[] nums={8,3,4,6,2,1,16};
        int original=2;

        System.out.println("The final value : "+findFinalValue(nums, original));
        System.out.println("The final value using Boolean Array (for smaller range) : "+findFinalValueByBooleanArray(nums, original));
        
    }
    public static int findFinalValue(int[] nums,int original){
        HashSet<Integer> set=new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(original)) {
            original = original * 2;
        }
        return original;
    }

    public static int findFinalValueByBooleanArray(int[] nums,int original){
        boolean[] numbers=new boolean[2001]; // the constraints: 1 <= nums.length <= 1000
        for (int b : nums) {
            numbers[b]=true;
        }
        while (numbers[original]) {
            original = original * 2;
        }
        return original;
    }
}
