class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String f_half = s.substring(0,n/2);
        String s_half = s.substring(n/2);
        
        int cA = 0;
        int cB = 0;
        
        for(int i=0; i<n/2; i++){
            if(ifVowel(f_half.charAt(i))){
                cA++;
            }
            
            if(ifVowel(s_half.charAt(i))){
                cB++;
            }
        }
        
        if(cA==cB) return true;
        
        return false;
    }
    
    static boolean ifVowel(char c){
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
            return true;
        }
        
        return false;
    }
}