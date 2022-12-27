class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(arr);
        int ans = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                ans++;
            }
            else{
                additionalRocks -= arr[i];
                ans++;
                if(additionalRocks<=0) break;
            }
        }

        if(additionalRocks<0) ans--;
        return ans;
    }
}