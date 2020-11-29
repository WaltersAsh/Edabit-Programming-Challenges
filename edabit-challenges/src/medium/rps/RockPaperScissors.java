package medium.rps;

/**
 * Medium Edabit Challenge Answer - "Simulate the Game "Rock, Paper, Scissors"
 * https://edabit.com/challenge/3S8XppR6Yf5mXPxij
 *
 * @author Justin Joe
 */
public class RockPaperScissors {

  public static String result;

  public static String rps(String s1, String s2) {
    if (s1.equals(s2)) {
      return "TIE";
    }

    findWinner(s1, s2, "rock", "scissors");
    findWinner(s1, s2, "scissors", "paper");
    findWinner(s1, s2, "paper", "rock");

    return result;
  }

  public static void findWinner(String s1, String s2, String rock, String scissors) {
    if (s1.equals(rock)) {
      if (s2.equals(scissors)) {
        result = "Player 1 wins";
      } else {
        result = "Player 2 wins";
      }
    }
  }
}
