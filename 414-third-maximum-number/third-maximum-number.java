class Solution {
    public int thirdMax(int[] nums) {
        // int n = nums.length;
        // int Fmax = Integer.MIN_VALUE;
        // int Smax= 0;
        // int ThirdMax = 0;
        // for(int i = 0;i<n;i++){
        //     if(arr[i]>max){
        //         max
        //     }
        // }
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n-3];
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        for(int i = n-1;i>0;i--){
            if(nums[i] != nums[i-1]){
                count++;
            
            if(count == 3){
                return nums[i-1];
            }
            }
        }
            return nums[n-1];
    }
}