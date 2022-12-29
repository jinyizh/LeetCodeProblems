import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Class to put solution.
 * Note: method needs to be static in order to be called in Main!
 * Or create a new Solution to call the method.
 */
class Solution {
  public boolean canJump(int[] nums) {
    int max = 0; // max position one can reach
    for (int i = 0; i < nums.length; i++) {
      max = i + nums[i];
    }
    return max >= nums.length;
  }
}
