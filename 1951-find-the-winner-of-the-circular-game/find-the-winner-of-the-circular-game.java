class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> people = new ArrayList<>();
        for(int i =1;i<=n;i++){
            people.add(i);
        }
        return kill(people,k,0);
    }

    int kill(List<Integer> people,int k,int i){
        if(people.size()==1){
            return people.get(0);
        }
        i = (i+k-1)%people.size();
        people.remove(i);
        return kill(people,k,i);
    }
}