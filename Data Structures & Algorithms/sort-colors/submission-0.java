class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        for(int i=0;i<nums.length;i++){
            switch(nums[mid]){
                case 0:{
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                    break;
                }
            }
        }
    }
}
