class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = prices.clone();
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<prices.length;i++){
            while(!st.isEmpty() && prices[i]<=result[st.peek()]){
                result[st.peek()] = result[st.peek()] - prices[i];
                st.pop();
            }
            st.push(i);
        }
        return result;
    }
}