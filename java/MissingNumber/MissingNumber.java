public class MissingNumber {

    /* Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
     * For example,
     * Given nums = [0, 1, 3] return 2.
     */
    public int missingNumber(int[] nums) {
        int missing = 0;
        for (int i = 0; i <= nums.length; i += 1) {
            missing += i;
        }
        
        for (int i = 0; i < nums.length; i += 1) {
            missing -= nums[i];
        }
        return missing;
    }
    
}
