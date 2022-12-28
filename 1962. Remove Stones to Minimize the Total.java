class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        int sum = 0;

        for(int p: piles){
            sum += p;
            q.offer(p);
        }

        while(k!=0){
            int cur = q.poll();
            if(cur<2){
                break;
            }
            int remove = cur/2;
            cur -= remove;
            sum -= remove;
            q.offer(cur);
            k--;

        }
        return sum;
    }
}