

public class BubbleSort {
    public static void main(String[] args) {
        int nums[]={3,5,7,9};
        System.out.println("Before sorting");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        bubbleSort(nums);
         System.out.println("After sorting");
         for (int i : nums) {
           
            System.out.print(i + " ");
        }

    }
    public static void bubbleSort(int nums[]){
        int temp=0;
        int count=0;
        int innercount=0;
        int outercount=0;
        boolean swap;
        //outer loop for iteration
        for (int i = 0; i < nums.length; i++) {
            outercount++;
            swap=false;
            for (int j = 0; j < nums.length-i-1; j++) {
                innercount++;
                if (nums[j] > nums[j+1]) {
                    count++;
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap=true;
                }
            }
            if (swap == false) {
            break;
        }
        }
        System.out.println();
        System.out.println(count);
        System.out.println(innercount);
        System.out.println(outercount);
    }
}
