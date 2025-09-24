import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal_166 {

    public static void main(String[] args) {
     System.out.println(fractionToDecimal(4,333));
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0 ) return "0";
        StringBuilder result=new StringBuilder();
        if((numerator < 0) ^ (denominator < 0)){
            result.append("-");
        }
        // constraint -231 <= numerator, denominator <= 231 - 1
        long num=Math.abs((long) numerator);
        long den=Math.abs((long) denominator);
        // get the quotient , the result part
        result.append(num/den);
        // get the remainder
        long remainder = num % den;
         
        if(remainder == 0){
            return result.toString();
        }

        result.append(".");

        Map<Long,Integer> remainderTracking=new HashMap<>();

        while(remainder !=0 ){
            if(remainderTracking.containsKey(remainder)){
                int repeatingNum=remainderTracking.get(remainder);
                result.insert(repeatingNum,"(");
                result.append(")");
                break;
            }
            remainderTracking.put(remainder,result.length());
            remainder *=10;
            result.append(remainder/den);
            remainder %=den;
        }
        return result.toString();
    }

}