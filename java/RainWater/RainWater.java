public class RainWater {


    /* 
     * Given n non-negative integers representing an elevation map where the
     * width of each bar is 1, compute how much water it is able to trap
     * after raining.
     *
     * [0,1,0,2,1,0,1,3,2,1,2,1] -> 6
     * [1,5,3,7,2] -> 2
     */
    public static int compute(int[] height) {
        int waterAccumulated = 0;
        int n = height.length;
        if (n == 0 || n == 1) {
            return 0;
        }
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int tempMax = height[0];

        for (int i = 0; i < n; i += 1) {
            if (height[i] > tempMax) {
                tempMax = height[i];
            }
            leftMax[i] = tempMax;
        }

        tempMax = height[n-1];
        for (int j = n - 1; j >= 0; j -= 1) {
            if (height[j] > tempMax) {
                tempMax = height[j];
            }
            rightMax[j] = tempMax;
        }

        for (int k = 0; k < n; k += 1) {
            waterAccumulated += Math.min(leftMax[k], rightMax[k]) - height[k];
        }
        return waterAccumulated;
    }
}
