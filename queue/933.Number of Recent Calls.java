import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> initialRange = new LinkedList<>();
    private int result = -3000;
    private int[] currentRange = new int[2];

    public RecentCounter() {
        currentRange[0] = -3000;
    }

    public int ping(int t) {
        int counter = 0;
        currentRange[0] = t - Math.abs(result);
        currentRange[1] = t;
        initialRange.offer(t);
        Iterator<Integer> it = initialRange.iterator();
        while (it.hasNext()) {
            int val = it.next();
            if (currentRange[0] <= val && currentRange[1] >= val) {
                counter++;
            }
        }

        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */