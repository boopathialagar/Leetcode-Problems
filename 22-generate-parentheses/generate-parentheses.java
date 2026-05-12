class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        find(result,0,0,"",n);
        return result;
    }
    public void find(List<String> result,int oc,int cc,String s,int n){
        if(s.length() == 2*n){
            result.add(s);
            return;
        }
        if(oc<n){
            find(result,oc+1,cc,s+"(",n);
        }
        if(cc<oc){
            find(result,oc,cc+1,s+")",n);
        }
    }
}