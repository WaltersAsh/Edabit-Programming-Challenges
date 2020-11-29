package veryhard.strongpass;

/**
 * Very Hard Edabit Challenge Answer - "Strong Password"
 * https://edabit.com/challenge/hj5YbZ7u7cAWzEvCB
 *
 * @author Justin Joe
 */
public class StrongPassword {

  static final String numbers = "0123456789";
  static final String lower_case = "abcdefghijklmnopqrstuvwxyz";
  static final String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  static final String special_characters = "!@#$%^&*()-+";

  static int charsNeeded = 0;

  public static int strongPassword(String password) {
    charsNeeded = 0;
    if (password.length() < 6) {
      return 6 - password.length();
    }
    search(password, numbers);
    search(password, lower_case);
    search(password, upper_case);
    search(password, special_characters);
    return charsNeeded;
  }

  public static void search(String password, String required) {
    for (char c : required.toCharArray()) {
      if (password.indexOf(c) > -1) {
        return;
      }
    }
    charsNeeded++;
  }
}
