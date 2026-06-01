class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int i=0;
        int ans=0;
        int n=s.length();
        char[]freq=new char[26];
        for(int j=0;j<n;j++){
            freq[s.charAt(j)-'A']++;
            max=Math.max(max,freq[s.charAt(j)-'A']);
            if(j-i+1-max>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}
