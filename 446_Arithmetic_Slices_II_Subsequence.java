class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
         
        Map<Integer, Integer>[] dp = (Map<Integer, Integer>[])new HashMap<?,?>[A.length];
         
        for (int i = 0; i < dp.length; i++) {
            dp[i] = new HashMap<>();
        }
         
        int ans = 0;
         
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                long diff = (long)A[j] - (long)A[i];
                if (diff > Integer.MAX_VALUE || diff < Integer.MIN_VALUE) {
                    continue;
                }
                 
                int delta = (int) diff;
                int vali = dp[i].getOrDefault(delta, 0);
                ans += vali;
                 
                vali += 1;
                int valj = dp[j].getOrDefault(delta, 0);
                dp[j].put(delta, vali + valj);
            }
        }
         
        return ans;
    }
}