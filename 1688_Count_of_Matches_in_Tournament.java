class Solution {
    public int numberOfMatches(int n) {
        int ans = 0;
        int x = n;
        int carry = 0;
        if (n==1) return 0;
        
        while(x>1){
            if(x%2==1){
                carry = 1;
            }
            
            x = x/2;
            ans += x;
            x = x+carry;
            carry = 0;
        }
        
        return ans;
    }
}