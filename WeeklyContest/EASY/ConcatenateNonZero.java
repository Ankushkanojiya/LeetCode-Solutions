package WeeklyContest.EASY;
public class ConcatenateNonZero {
    public static void main(String[] args) {
        long n=1038474;
        System.out.println(sumAndMultiply(n));
    }
    public static long sumAndMultiply(long n){
        long temp=n;
        long x=0; // the integer we have to built without zero
        long multiply=1; // to get the place of Digits in right orDer
        while (temp>0) {
            long lastDigit=temp % 10;
            if (lastDigit != 0) {
                x= (lastDigit * multiply ) + x;
                multiply *=10;
            }
            temp /=10; // remove the last Digit
        }
   
        long sum=0;
        long temp2=x;
        while (temp2 > 0) {
            sum = sum + (temp2 % 10);
            temp2 /=10;
        }
        return x * sum;
    }
}