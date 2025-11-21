import java.util.HashSet;
import java.util.Set;

public class PalindromicSubsequences {
    public static void main(String[] args) {
        String s="aabca";
        System.out.println(countPalindromicSubsequences(s));
    }
    public static int countPalindromicSubsequences(String s){
        Set<Character> letters=new HashSet<>();
        for (Character ch : s.toCharArray()) {
            letters.add(ch);
        }

        int result=0;
        for (Character letter:letters) {
            int i=-1; //for fisrt occurance
            int j=0; // for last occurance

            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == letter) {
                    if (i==-1) {
                        i=k; // first time seeing in string at index value
                    }
                    j=k; // last time seeing in string 
                }
            }

            Set<Character> between=new HashSet<>();
            for (int k = i+1; k < j; k++) {
                between.add(s.charAt(k));
            }
            result +=between.size();
        }
        return result;
    }
}
