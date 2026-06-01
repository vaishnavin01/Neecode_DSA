class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        int windowsize=s1.length();
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        for(int j=0;j<s2.length();j++){
            freq2[s2.charAt(j)-'a']++;
            if(j>=windowsize){
                freq2[s2.charAt(j-windowsize)-'a']--;
            }
            if(matches(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
    public boolean matches(int freq1[],int freq2[]){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
