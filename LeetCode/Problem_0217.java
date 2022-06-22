import java.util.*;

class Problem_0217 {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
               return true;  
            }
            
        }
        return false;
    }
}