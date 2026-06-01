class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left=0;
        int right=0;
        int n=nums.length;
        int ans[]=new int[n-k+1];

        while(left<n-k+1){
            int max=nums[left];
            for(int j=left;j<left+k;j++){
                max=Math.max(max,nums[j]);
            }
            ans[left]=max;
            left++;
        }
        return ans;
    }
}
