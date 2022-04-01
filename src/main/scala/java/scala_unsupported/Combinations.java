package leet.java.scala_unsupported;

import java.util.*;

public class Combinations {
    List<List<Integer>> output = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
        combineNonRepeat(1, n, k, new LinkedList<Integer>());
        return output;
    }

    public void combineNonRepeat(int start, int n, int k, LinkedList<Integer> combination) {
        if(combination.size() == k) {
            output.add(new LinkedList(combination));
        }

        for(int i = start; i <= n; i++) {
            combination.add(i);

            combineNonRepeat(i + 1, n, k, combination);

            combination.removeLast();
        }
    }
}
