import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CombinationSum {

    /* 
     * Given candidate set 2,3,6,7 and target 7
     * A solution set is: 
     * [7] 
     * [2, 2, 3] 
     *
     * All numbers (including target) will be positive integers.
     * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
     * The solution set must not contain duplicate combinations.
     */

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> combinations = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        findCombinations(candidates, target, 0, combinations, new ArrayList<Integer>());
        return combinations;
    }

    private static void findCombinations(int[] candidates, int target, 
                                  int currIndex, ArrayList<List<Integer>> combinations,
                                  ArrayList<Integer> combo) {

        for (int i = currIndex; i < candidates.length; i += 1) {
            if (candidates[i] < target) {
                combo.add(candidates[i]);
                findCombinations(candidates, target - candidates[i], i, combinations, combo);
                combo.remove(combo.size() - 1);
            }
            if (candidates[i] == target) {
                combo.add(candidates[i]);
                combinations.add(new ArrayList<Integer>(combo));
                combo.remove(combo.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
    }


}