import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> ans0 = new HashMap<>();
        Map<Integer, Boolean> ans1 = new HashMap<>();

        Set<Integer> res1 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            ans0.put(nums1[i], true);
        }

        for (int i = 0; i < nums2.length; i++) {
            ans1.put(nums2[i], true);
            if (!ans0.getOrDefault(nums2[i], false)) {
                res1.add(nums2[i]);
            }
        }

        Set<Integer> res2 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (!ans1.getOrDefault(nums1[i], false)) {
                res2.add(nums1[i]);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(res2));
        result.add(new ArrayList<>(res1));

        return result;
    }
}