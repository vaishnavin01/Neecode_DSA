class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxwater=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int height=Math.min(heights[i],heights[j]);
            int currwater=height*(j-i);
             maxwater=Math.max(maxwater,currwater);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxwater;
    }
}
