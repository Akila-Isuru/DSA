import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {6,5,2,8,9,4};
//        int[] result = bubbleSort(nums);
        int [] result = insertionSort(nums);
        System.out.println(("Sorted array :"+ Arrays.toString(result)));
    }

    public static int[] bubbleSort(int[] nums) {

        int temp = 0;

        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }
        return nums;

    }

    public static int[] insertionSort(int[] nums) {

        for (int i =1;i<nums.length;i++){
            int key = nums[i];
             int j =i-1;

             while(j>=0 && nums[j]>key){
                 nums[j+1]= nums[j];
                 j = j-1;
             }
             nums[j+1] = key;
        }
        return nums;
    }
}
