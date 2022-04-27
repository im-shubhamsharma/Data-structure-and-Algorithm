import java.util.*;

public class Problem_0268{
    public static void main(String[] args) {
        
        int[] nums = {3,0,1,2,4,6};
        missingNumber(nums);

    }

    public static void missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }
        int result = n*(n+1)/2 - sum;
        System.out.println(result);
}
}