package encryption;

import java.util.Arrays;

/**
 * Expert Edabit Challenge Answer - "Edabit's Encryption Scheme"
 * https://edabit.com/challenge/jfCsugyp9BSLYEtwb
 *
 * @author Justin Joe
 */
public class Encryption {

  public static String encryption(String s) {
    char[][] grid;
    StringBuilder sb = new StringBuilder(s);

    for (int i = 0; i < sb.length(); i++) {
      char curr = sb.charAt(i);
      if (curr == ' ') {
        sb.deleteCharAt(i);                                                      //remove spaces
      }
    }
    String text = sb.toString();
    double root = Math.sqrt(text.length());
    int upper = (int) Math.ceil(root);
    int lower = (int) Math.floor(root);

    if (!(lower * upper >= text.length())) {                                    //ensure that rows * columns >= L
      lower = upper;
    }
    grid = new char[lower][upper];
    int charArIndex = 0;
    for (int row = 0; row < grid.length; row++) {                               //populate 2d array with text
      for (int col = 0; col < grid[row].length; col++) {
        if (charArIndex != text.toCharArray().length) {
          grid[row][col] = text.toCharArray()[charArIndex];
          charArIndex++;
        }
      }
    }

    StringBuilder nsb = new StringBuilder();
    int lastRowLength = grid[grid.length - 1].length;

    for (int col = 0; col < grid[0].length; col++) {
      for (int row = 0; row < grid.length; row++) {
        if (grid[row][col] == '\u0000') {                                      //further spaces to be removed
          if (row == grid.length - 1) {
            if (row != lastRowLength && col != grid.length) {
              nsb.append(" ");
            }
          }
          continue;
        }
        nsb.append(grid[row][col]);
        if (row == grid.length - 1) {
          if (row != lastRowLength && col != grid.length) {
            nsb.append(" ");
          }
        }
      }
    }
    if (nsb.toString().charAt(nsb.length() - 1) == ' ') {                   //double check no space last in element
      nsb.deleteCharAt(nsb.length() - 1);
    }

    //debugging
    System.out.println(Arrays.deepToString(grid).replace("], ", "]\n")
            .replace("[[", "[").replace("]]", "]"));
    System.out.println(nsb.toString());

    return nsb.toString();
  }
}


