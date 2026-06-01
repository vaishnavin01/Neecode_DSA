class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
        
    }
    private void mergesort(int nums[],int l,int r){
        int m=(l+r)/2;
        if(l>=r){
            return;
        }
        mergesort(nums,l,m); //sort left part
        mergesort(nums,m+1,r);
        merge(nums,l,m,r);//sort right part
    }
    private void merge(int arr[],int l,int m,int r){
        List<Integer>list=new ArrayList<>();
        int i=l;
        int j=m+1;
        while(i<=m && j<=r){
            if(arr[i]<arr[j]){
                list.add(arr[i]);
                i++;
            }
            else{
                list.add(arr[j]);
                j++;
            }
        }
        while(i<=m){
            list.add(arr[i]);
            i++;
        }
        while(j<=r){
            list.add(arr[j]);
            j++;
        }
        for(i=l;i<=r;i++){
            arr[i]=list.get(i-l);
        }
    }
}