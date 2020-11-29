package medium.clonelist;

/**
 * Medium Edabit Challenge Answer - "Clone a List"
 * https://edabit.com/challenge/T3zjJiXoNRqXqEx9u
 *
 * @author Justin Joe
 */
public class CloneList {
  public static Object[] clone(Object[] arr) {
    Object[] objs = new Object[arr.length + 1];
    System.arraycopy(arr, 0, objs, 0, arr.length);
    objs[objs.length - 1] = arr;
    return objs;
  }
}