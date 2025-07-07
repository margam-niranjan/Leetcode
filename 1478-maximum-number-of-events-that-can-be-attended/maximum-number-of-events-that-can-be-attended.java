class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b) -> Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0, count =0;
        for(int i = 1 ; i <= 100000; i++){
            while(index < events.length && events[index][0] == i){
                pq.add(events[index][1]);
                index++;
            }
            while(!pq.isEmpty() && pq.peek() < i)pq.poll();
            if(!pq.isEmpty()){
                pq.poll();
                count++;
            }
        }
        return count;
    }
}