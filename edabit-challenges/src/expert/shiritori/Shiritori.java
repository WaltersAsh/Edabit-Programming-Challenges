package expert.shiritori;

import java.util.ArrayList;
import java.util.List;

/**
 * Expert Edabit Challenge Answer - "Shiritori Game"
 * https://edabit.com/challenge/rqum6rzyZQrC43Ldv
 *
 * @author Justin Joe
 */
class Shiritori {

  List<String> words;
  boolean game_over;

  public Shiritori() {
    this.game_over = false;
    this.words = new ArrayList<>();
  }

  public Object play(String word) {
    if (words.isEmpty()) {
      words.add(word);
      return words.toArray(new String[0]);
    } else if (words.contains(word)) {
      game_over = true;
      return "game over";
    }
    char firstLetter = word.charAt(0);
    String lastWord = words.get(words.size() - 1);
    char lastLetter = lastWord.charAt(lastWord.length() - 1);

    if (firstLetter == lastLetter) {
      words.add(word);
      return words.toArray(new String[0]);
    }

    game_over = true;
    return "game over";
  }

  public String restart() {
    words.clear();
    return "game restarted";
  }

  public String[] getWords() {
    return words.toArray(new String[0]);
  }
}