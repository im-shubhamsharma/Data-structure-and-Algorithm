class Problem_0977 {
    public int[] sortedSquares(int[] nums) {
        int p1 = 0, p2 = nums.length-1, idx=nums.length-1;
        int sqArr[] = new int[nums.length];
        
        while(idx>=0){
            if(nums[p1]*nums[p1] > nums[p2]*nums[p2]){
                sqArr[idx] = nums[p1]*nums[p1];
                p1++;
            }else{
                sqArr[idx] = nums[p2]*nums[p2]; 
                p2--;
            }
            idx--;
        }

        return sqArr;
    }
}

/*
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        
      Arrays.sort(nums); 
      return nums;
    }
}
*/