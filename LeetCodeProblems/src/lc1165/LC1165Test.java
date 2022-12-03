package lc1165;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * There is a special keyboard with all keys in a single row.
 * Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25).
 * Initially, your finger is at index 0.
 * To type a character, you have to move your finger to the index of the desired character.
 * The time taken to move your finger from index i to index j is |i - j|.
 * You want to type a string word.
 * Write a function to calculate how much time it takes to type it with one finger.
 */

class LC1165Test {

  String keyboard, keyboard1, keyboard2, keyboard3;
  String word, word1, word2, word3;

  @BeforeEach
  void setUp() {
    keyboard = "abcdefghijklmnopqrstuvwxyz";
    keyboard1 = "pqrstuvwxyzabcdefghijklmno";
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void test() {
  }
}