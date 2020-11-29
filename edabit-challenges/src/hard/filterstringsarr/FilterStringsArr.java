package hard.filterstringsarr;

import java.util.ArrayList;
import java.util.List;

/**
 * Hard Edabit Challenge Answer - "Filter out Strings from an Array"
 * https://edabit.com/challenge/vNszi3mbJA5BhgGFX
 *
 * @author Justin Joe
 */
public class FilterStringsArr {

  public static String[] filterArray(String[] str) {
    List<String> nums = new ArrayList<>();
    for (String s : str) {
      try {
        Integer.parseInt(s);
        if (nums.contains(s)) {
          continue;
        }
        nums.add(s);
      } catch (NumberFormatException ignore) {
      }
    }
    return nums.toArray(new String[0]);
  }
}
