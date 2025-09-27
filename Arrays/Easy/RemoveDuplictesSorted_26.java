public class RemoveDuplictesSorted_26 {

    public static void main(String[] args) {
        int nums[]={2,2,3,3,3,4,6,6,7,8,9};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int nums[]){
        int count=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] != nums[i]) {// find the unique element
                count++;// move the pinter to next element
                nums[count]=nums[i];// assign the unique element to that position
            }
        }
        return count+1;
    }
}