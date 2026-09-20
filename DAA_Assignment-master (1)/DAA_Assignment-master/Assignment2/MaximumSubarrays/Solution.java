class Solution {
    public int maxSubArray(int[] nums) {
        int cmax = 0;
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            cmax += i;
            max = Math.max(max,cmax);
            if(cmax<0) cmax = 0;
        }
        return max;
    }
}