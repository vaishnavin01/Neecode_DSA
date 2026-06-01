class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longestseq=0;
        for(int n:nums){
            if(!set.contains(n-1)){
                int currseq=1;
                int currnum=n;
                while(set.contains(currnum+1)){
                    currseq++;
                    currnum++;
                }
                longestseq=Math.max(currseq,longestseq);
            }
        }
        return longestseq;
    }
}
