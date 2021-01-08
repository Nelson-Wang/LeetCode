class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<Integer>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000 && !queue.isEmpty()){
            queue.poll();
        }
        return queue.size();
    }
}
