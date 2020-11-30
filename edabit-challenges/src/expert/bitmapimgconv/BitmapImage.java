package expert.bitmapimgconv;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Expert Edabit Challenge Answer - "Bitmap Image Conversion"
 * https://edabit.com/challenge/M69ui5BrdTjACd3R3
 *
 * @author Justin Joe
 */
public class BitmapImage {

  static Map<Character, int[][]> numMap = new HashMap<>();
  static int[][] timeArr = new int[5][17];

  public static String convertToBitstring(String time) {
    //2d array of bitmaps for each number
    numMap.put('1', new int[][] {{0, 1, 0}, {1, 1, 0}, {0, 1, 0}, {0, 1, 0}, {1, 1, 1}});
    numMap.put('2', new int[][] {{1, 1, 1}, {0, 0, 1}, {1, 1, 1}, {1, 0, 0}, {1, 1, 1}});
    numMap.put('3', new int[][]{{1, 1, 1}, {0, 0, 1}, {1, 1, 1}, {0, 0, 1}, {1, 1, 1}});
    numMap.put('4', new int[][]{{1, 0, 1}, {1, 0, 1}, {1, 1, 1}, {0, 0, 1}, {0, 0, 1}});
    numMap.put('5', new int[][]{{1, 1, 1}, {1, 0, 0}, {1, 1, 1}, {0, 0, 1}, {1, 1, 1}});
    numMap.put('6', new int[][]{{1, 0, 0}, {1, 0, 0}, {1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
    numMap.put('7', new int[][]{{1, 1, 1}, {0, 0, 1}, {0, 0, 1}, {0, 0, 1}, {0, 0, 1}});
    numMap.put('8', new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
    numMap.put('9', new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}, {0, 0, 1}, {0, 0, 1}});
    numMap.put('0', new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 0, 1}, {1, 0, 1}, {1, 1, 1}});

    //scan the time to chars
    char h1 = time.charAt(0);
    char h2 = time.charAt(1);
    char m1 = time.charAt(3);
    char m2 = time.charAt(4);
    fillTimeArr(h1, h2, m1, m2);

    //debug
    System.out.println(Arrays.deepToString(timeArr).replace("], ", "]\n")
            .replace("[[", "[").replace("]]", "]"));

    //build and return the string result
    StringBuilder sb = new StringBuilder();
    for (int[] ints : timeArr) {
      for (int col = 0; col < timeArr[0].length; col++) {
        sb.append(ints[col]);
      }
    }
    return sb.toString();
  }

  public static void fillTimeArr(char h1, char h2, char m1, char m2) {
    //translate each 3x5 2d bitmap array into final 17x5 2d bitmap array
    for (int row = 0; row < numMap.get(h1).length; row++) {
      for (int col = 0; col < numMap.get(h1)[0].length; col++) {
        timeArr[row][col] = numMap.get(h1)[row][col];
        timeArr[row][col + 4] = numMap.get(h2)[row][col];
        timeArr[row][col + 10] = numMap.get(m1)[row][col];
        timeArr[row][col + 14] = numMap.get(m2)[row][col];
      }
    }

    //add extra bits for colon between hours and minutes
    timeArr[1][8] = 1;
    timeArr[3][8] = 1;
  }
}
