class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set=new TreeSet<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);

        }
        for(int num:set){
            nums[ans]=num;
            ans++;
        }

        return set.size();
        
    }
}