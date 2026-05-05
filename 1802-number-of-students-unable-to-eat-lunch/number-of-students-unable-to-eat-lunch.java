class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int s:students)q.offer(s);

        int i =0,count = 0;

        while(!q.isEmpty() && count<q.size()){
            if(q.peek() == sandwiches[i]){
                q.poll();
                i++;
                count = 0;
            }
            else{
                q.offer(q.poll());
                count++;
            }
        }
        return q.size();
    }
}