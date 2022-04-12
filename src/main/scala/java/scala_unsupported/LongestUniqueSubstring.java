package leet.java.scala_unsupported;

import java.util.*;

public class LongestUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int res = 0;

        for (int i =0, j = 0; j < n; j ++) {
            char c = s.charAt(j);
            if(map.containsKey(c)) {
                i = Math.max(map.get(c), i);
            }
            res = Math.max(res, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }

        return res;
    }
}
