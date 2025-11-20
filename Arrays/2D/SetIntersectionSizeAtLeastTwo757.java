import java.util.Arrays;

public class SetIntersectionSizeAtLeastTwo757 {
    public static int intersectionSizeTwo(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> {
            if (a[1] !=b[1]) {
                return a[1] - b[1];
            }else{
                return b[0]-a[0];
            }
        });

        int last=-1;
        int secondLast=-1;
    
        int size=0;
        for (int[] interval : intervals) {
            int start=interval[0];
            int end=interval[1];

            if (start > last) {
                size +=2;
                secondLast =end -1;
                last=end;
            }else if(start > secondLast){
                size +=1;
                secondLast=last;
                last=end;
            }
        }
        return size;

    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{3,7},{8,9}};
        System.out.println(intersectionSizeTwo(intervals));
    }
}
