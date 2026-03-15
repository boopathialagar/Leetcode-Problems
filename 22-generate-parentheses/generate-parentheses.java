class Solution {
    void backtrack(ArrayList<String> res,int oc, int cc, String s, int n){
            if(s.length()==n*2){
                res.add(s);
                return;
            }
            if(oc<n){
                backtrack(res,oc+1,cc,s+"(",n);
            }
            if(cc<oc){
                backtrack(res,oc,cc+1,s+")",n);
            }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        backtrack(result,0,0,"",n);
        return result; 
    }
}