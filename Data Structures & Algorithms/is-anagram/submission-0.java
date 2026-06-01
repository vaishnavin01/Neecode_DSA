class Solution {
    public boolean isAnagram(String s, String t) {
int l1=s.length();
int l2=t.length();
if(l1!=l2){
    return false;
}
HashMap<Character,Integer>map=new HashMap<>();
for(int i=0;i<l1;i++){
    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
}
for(int i=0;i<l2;i++){
    char ch=t.charAt(i);
    if(!map.containsKey(ch) || map.get(ch)==0){
        return false;
    }
    map.put(ch,map.get(ch)-1);
}
return true;
    }
}
