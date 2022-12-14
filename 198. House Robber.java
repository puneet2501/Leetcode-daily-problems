class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);


        int a = nums[0];
        int b = Math.max(a,nums[1]);
        int ans = 0;

        for(int i=2; i<n; i++){
            ans = Math.max(nums[i]+a,b);
            a = b;
            b = ans;
        }

        return ans;
    }
}