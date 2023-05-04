# 3. Longest Substring Without Repeating Characters (M)
Given a string ```s```, find the length of the longest substring without repeating characters.
## Brute Force
```java
public int lengthOfLongestSubstring(String s) {
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
        for (int j = i; j < s.length(); j++) {
            if (check(s,i, j)) res = Math.max(res, j - i + 1);
        }
    }
    return res;
}

private boolean check(String s, int start, int end) {
    int[] chars = new int[128];
    for (int i = start; i <= end; i++) {
        char c = s.charAt(i);
        chars[c]++;
        if (chars[c] > 1) return false;
    }
    return true;
}
```
