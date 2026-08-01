public class Demo {
    public static void main(String[] args) {

        int [] nums = {1,7,8,12,17};
        int target_value = 17;

        int result = binarySearch(nums,target_value);
        if(result!=-1){
            System.out.println("Element found at index "+result+" at value "+target_value);
        }else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int targetValue) {

        for(int i =0;i<nums.length;i++){
            if(nums[i]==targetValue){
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] nums,int targetValue){
     int left=0;
     int right =  nums.length-1;

     while(left<=right){
        int mid = (left+right)/2;

        if(nums[mid]==targetValue){
            return mid;
        }
        else if(targetValue<nums[mid]){
            right= mid -1;

        }else{
            left =mid+1;
        }

    }

    return -1;
}
}
