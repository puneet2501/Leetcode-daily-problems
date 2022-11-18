class Solution {
    public boolean isUgly(int n) {
        
        if(n==1) return true;
        
        int ans=n;
        
        while(ans>1){
            
            
            if(ans%2==0){
                ans = ans/2;
            }
            if(ans%3==0){
                ans = ans/3;
            }
            if(ans%5==0){
                ans = ans/5;
            }     
            if(ans==1) return true;
            else if(ans%2!=0 && ans%3!=0 && ans%5!=0){
                return false;
            }
        }
    
        return (ans==1);
        
    }
}