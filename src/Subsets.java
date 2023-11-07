import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> findSubsets(int[] set, int n) {
        List<List<Integer>> subsets = new ArrayList<>();
        addSubsets(subsets, new ArrayList<>(), set, 0, n);
        return subsets;
    }

    private void addSubsets(List<List<Integer>> subsets, List<Integer> currentSubset, int[] set, int startIndex, int n) {
        if (currentSubset.size() == n) {
            subsets.add(new ArrayList<>(currentSubset));
            return;
        }

        for (int index = startIndex; index < set.length; index++) {
            currentSubset.add(set[index]);
            addSubsets(subsets, currentSubset, set, index + 1, n);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets generator = new Subsets();
        int[] set = {1, 2, 3};
        int n = 2;

        List<List<Integer>> subsets = generator.findSubsets(set, n);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
