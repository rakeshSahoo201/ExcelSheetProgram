package puzzle;

public class TrappingRainWaterProg33 {



        public int trap(int[] height) {
            int n = height.length;
            int left = 0, right = n - 1;
            int leftMax = 0, rightMax = 0;
            int water = 0;

            while (left < right) {
                if (height[left] < height[right]) {
                    if (height[left] >= leftMax)
                        leftMax = height[left];
                    else
                        water += leftMax - height[left];
                    left++;
                } else {
                    if (height[right] >= rightMax)
                        rightMax = height[right];
                    else
                        water += rightMax - height[right];
                    right--;
                }
            }

            return water;
        }

        public static void main(String[] args) {
            TrappingRainWaterProg33 solver = new TrappingRainWaterProg33();
            int[] arr = {3, 0, 2, 0, 4};
            System.out.println("Trapped Water: " + solver.trap(arr));  // Output: 7
        }
    }



