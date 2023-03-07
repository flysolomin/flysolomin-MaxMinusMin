
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        if (nums == null || nums.size() < 2) {
            throw new IllegalArgumentException("List must contain at least 2 integers");
        }
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int num = nums.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }
}
