class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        int n = nums.length;
        int ans = -1;
        int minAvgDiff = Integer.MAX_VALUE;
        long currPrefixSum = 0;
        long totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }


        for (int index = 0; index < nums.length; index++) {
            currPrefixSum += nums[index];
            long leftPartAverage = currPrefixSum;
            leftPartAverage /= (index + 1);

            long rightPartAverage = totalSum - currPrefixSum;
            if (index != n - 1) {
                rightPartAverage /= (n - index - 1);
            }

            int currDifferent = (int) Math.abs(leftPartAverage - rightPartAverage);
            if (currDifferent < minAvgDiff) {
                minAvgDiff = currDifferent;
                ans = index;
            }
        }

        return ans;
    }
}