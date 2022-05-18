public class Problem_0136 {

    public int singleNumber(int[] nums) {

        int unique = 0;
        for (int val : nums) {
            unique = unique ^ val; // XOR operation
        }
        return unique;
    }

}
