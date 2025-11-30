package Arrays.Easy;
import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public static void main(String[] args) {
        int[] nums={1,1,1};
        System.out.println(prefixesDivBy5(nums));
    }
    public static List<Boolean> prefixesDivBy5(int[] nums){
        List<Boolean> answers=new ArrayList<>();
        int number=0;
        for (int num : nums) {
            number=(number * 2 + num) % 5;
            answers.add(number == 0);
        }
        return answers;
    }
}
