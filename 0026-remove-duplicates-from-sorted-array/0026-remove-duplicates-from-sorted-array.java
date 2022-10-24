import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != temp){
                nums[index++] = nums[i];
                temp = nums[i];
            }
        }
        nums = Arrays.copyOf(nums, index);
        return index;
            
    }
}