package medium.histogram;

import java.util.Collections;

/**
 * Medium Edabit Challenge Answer - "Histogram Function"
 * https://edabit.com/challenge/YLwQGrA24g9TmiGXf
 *
 * @author Justin Joe
 */
public class Histogram {
  public static String histogram(int[] arr, String chr) {
    StringBuilder result = new StringBuilder();
    for (int n : arr) {
      result.append(String.join("", Collections.nCopies(n, chr))).append("\n");
    }
    return result.toString().trim();
  }
}
