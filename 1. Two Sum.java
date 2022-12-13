class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i = 0;
        int j = i+1; 
        int a = 0; 
        int b = 0; 
        while(i<j){
            
            if(j<nums.length){
                
                if(target-nums[i] != nums[j]){
                    j++;
                }
                else{
                    a = i;
                    b = j;
                    i = j;
                }
            }
            
            else{
                i++;
                j=i+1;
                
            }
            
        }
        int[] res = {a,b};
        return res;
    }