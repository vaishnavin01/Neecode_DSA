class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        HashSet<Character>set=new HashSet<>();
        int maxlen=0;
        while(r<n){
            char ch=s.charAt(r);
            if(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            else{
                set.add(ch);
                maxlen=Math.max(maxlen,r-l+1);
                r++;
            }
        }
        return maxlen;
    }
}

   