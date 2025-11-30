package Arrays.Medium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestSumDivisiblebyThree {
    public static void main(String[] args) {
        int[] nums={3,6,8};
        System.out.println(maxSumDivThree(nums));
    }
    public static int maxSumDivThree(int[] nums){
        int totalSum=0;

        List<Integer> remainder1=new ArrayList<>();
        List<Integer> remainder2=new ArrayList<>();
        
        for (int num : nums) {
            totalSum+= num;

            if (num % 3 ==1) {
                remainder1.add(num);
            }else if (num % 3 ==2) {
                remainder2.add(num);
            }
        }
        int remainder=totalSum % 3;
        if (remainder ==0) {
            return totalSum;
        }
        Collections.sort(remainder1);
        Collections.sort(remainder2);

        if(remainder ==1){
            int remove1=remainder1.size() >=1?remainder1.get(0):Integer.MAX_VALUE;
            int remove2=remainder2.size() >=2?remainder2.get(0)+remainder2.get(1):Integer.MAX_VALUE;
            int removeMin=Math.min(remove1, remove2);
            return totalSum-removeMin;
        }
        int remove1 = remainder2.size() >= 1 ? remainder2.get(0) : Integer.MAX_VALUE;
        int remove2 = remainder1.size() >= 2 ? remainder1.get(0) + remainder1.get(1) : Integer.MAX_VALUE;

        int removeMin = Math.min(remove1, remove2);

        return totalSum - (removeMin == Integer.MAX_VALUE ? 0 : removeMin);
    }
}
