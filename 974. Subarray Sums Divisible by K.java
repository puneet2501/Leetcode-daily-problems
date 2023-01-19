class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,0);
        for(int i=0; i<n; i++){
            sum = sum+nums[i];
            int r = sum%k;
            if(r<0) r = r+k;
            if(hm.containsKey(r)){
                int x = hm.get(r);
                x++;
                hm.put(r,x);
                ans = ans+x;
                // System.out.println(ans + " " + i);
            }
            else{
                hm.put(r,0);
            }
        }
        
        return ans;
    }
}