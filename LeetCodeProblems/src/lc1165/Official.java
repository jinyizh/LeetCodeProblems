package lc1165;

/**
 * Time complexity: O(n), where n is the length of word
 * Space complexity: O(1). Constant space for storing indices.
 */

public class Official {
  public int calculateTime(String keyboard, String word) {

    // for ith value among keyIndices, i represents the alphabet (a = 0, b = 1...)
    int[] keyIndices = new int[26];

    // get the index for each key
    for (int i = 0; i < keyboard.length(); i++) {
      keyIndices[keyboard.charAt(i) - 'a'] = i; // mapping b/w "normal" a-z keyboard and keyboard passed
    } // for keyboard "ecdabf...", keyIndices looks like "341205..."

    // i: a, b, c, ... in number
    // keyIndices[i]: location of the alphabet in "keyboard" (index)

    // initialize previous index as starting index = 0
    int prev = 0, result = 0; // prev is the location of the previous key in "keyboard"

    // calculate total time
    for (char c : word.toCharArray()) {
      result += Math.abs(prev - keyIndices[c - 'a']);

      // update previous index
      prev = keyIndices[c - 'a'];
    }
    return result;
  }
}
