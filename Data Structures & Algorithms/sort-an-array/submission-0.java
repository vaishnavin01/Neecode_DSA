class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
        
    }
    private void mergesort(int arr[],int l,int r){
        if(l>=r)return;
        int m=(l+r)/2;
        mergesort(arr,l,m);
        mergesort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    private void merge(int[]nums,int l,int m,int r){
        List<Integer>list=new ArrayList<>();
        int i=l;
        int j=m+1;
        while(i<=m && j<=r){
            if(nums[i]<=nums[j]){
                list.add(nums[i]);
                i++;
            }
            else{
                list.add(nums[j]);
                j++;
            }
        }
        while(i<=m){
            list.add(nums[i]);
            i++;
        }
        while(j<=r){
            list.add(nums[j]);
            j++;
        }
        for(i=l;i<=r;i++){
            nums[i]=list.get(i-l);
        }
    }
}