class Solution {
    public int findNonMinOrMax(int[] nums) {
         int n = nums.length;
         if(n<3){
            return -1;
         }
         int min = nums[0];
         int max = nums[0];
         for(int m : nums){
            min = Math.min(min,m);
            max = Math.max(max,m);
         }
         for(int m: nums){
            if(m != min && m != max ){
                return m;
            }

         }
         return -1;
    }
}