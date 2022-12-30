/**
 * Class to put solution.
 * Note: method needs to be static in order to be called in Main!
 * Or create a new Solution to call the method.
 */
class Solution {
  public int subarraysDivByK(int[] nums, int k) {
    int prefixMod = 0, result = 0; // init
    // There are k mod groups 0...k - 1.
    int[] modGroups = new int[k];
    modGroups[0] = 1;
    for (int num : nums) {
      // Add k again чтобы take modulo twice to avoid negative remainders.
      // Only need to add k once more because negative remainder is always larger than -k.
      prefixMod = (prefixMod + num % k + k) % k;
      // Add the count of subarrays that have the same remainder as the current
      // one to cancel out the remainders.
      result += modGroups[prefixMod];
      modGroups[prefixMod]++;
    }
    return result;
  }
}