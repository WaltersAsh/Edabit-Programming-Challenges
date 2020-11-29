package medium.failedpassed;

/**
 * Medium Edabit Challenge Answer - "You FAILEDPASSED the Exam"
 * https://edabit.com/challenge/BxnxYJGQ9MMQn2EfR
 *
 * @author Justin Joe
 */
public class FailedPassed {
  public static String gradePercentage(String userScore, String passScore) {
    String s = "";
    if (Integer.parseInt(userScore
            .replace("%", "")) >= Integer.parseInt(passScore
            .replace("%", ""))) {
      s += "PASSED";
    } else {
      s += "FAILED";
    }
    return "You " + s + " the Exam";
  }
}
