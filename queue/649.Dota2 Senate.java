import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {

        int countR = 0;
        int countD = 0;
        Queue<Integer> resultR = new ArrayDeque<>();
        Queue<Integer> resultD = new ArrayDeque<>();
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'D') {
                resultD.offer(i);
            } else {
                resultR.offer(i);
            }
        }

        int tracker = senate.length();
        while (!resultD.isEmpty() && !resultR.isEmpty()) {
            resultD.poll();
            resultR.poll();
            if (resultD.peek() < resultR.peek()) {
                resultD.offer(tracker);
                resultR.poll();
            } else {
                resultR.offer(tracker);
                resultD.poll();
            }
            tracker++;
        }

        return resultD.isEmpty() ? "Radiant" : "Dire";
    }
}