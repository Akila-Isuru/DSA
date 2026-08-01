import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {6,5,2,8,9,4};
        int[] result = bubbleSort(nums);
        System.out.println(("Sorted array :"+ Arrays.toString(result)));
    }

    public static int[] bubbleSort(int[] nums) {

        int temp = 0;

        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;

    }
}
