import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Class to put solution.
 * Note: method needs to be static in order to be called in Main!
 * Or create a new Solution to call the method.
 */
public class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
    int n = temperatures.length;
    int[] answer = new int[n];
    Deque<Integer> stack = new ArrayDeque<>();

    for (int currDay = 0; currDay < n; currDay++) {
      int currentTemp = temperatures[currDay];
      // Pop until the current day's temperature is not
      // warmer than the temperature at the top of the stack
      while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
        int prevDay = stack.pop();
        answer[prevDay] = currDay - prevDay;
      }
      stack.push(currDay);
    }
    return answer;
  }
}
