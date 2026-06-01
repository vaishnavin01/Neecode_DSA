class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        int n=operations.length;
        for(int i=0;i<n;i++){
            String ch=operations[i];
            if(ch.equals("+")){
                
                int last=st.pop();
                int secondlast=st.peek();
                int sum=last+secondlast;
                st.push(last);
                st.push(sum);
            }
            else if(ch.equals("C")){
                st.pop();
            }
            else if(ch.equals("D")){
                st.push(2*st.peek());
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}