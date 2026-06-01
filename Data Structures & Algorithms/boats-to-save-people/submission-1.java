class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int minboat=0;
        int i=0;
        int n=people.length;
        int j=n-1;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum>limit){
                
                j--;
            }
            if(sum<=limit){
                i++;
                j--;
            }
            minboat++;
        }
        return minboat;
    }
}