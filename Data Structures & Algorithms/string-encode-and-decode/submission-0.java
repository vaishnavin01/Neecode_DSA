class Solution {

    public String encode(List<String> strs) {
        String res="";
        for(String s:strs){
            res+=(s.length()+"#"+s);
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String>ans=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            j++;
            ans.add(str.substring(j,j+len));
        i=j+len;
        }
        return ans;
        

    }
}
