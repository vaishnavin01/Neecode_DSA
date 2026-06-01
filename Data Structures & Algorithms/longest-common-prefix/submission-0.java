class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest="";
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
        
        
    }
}