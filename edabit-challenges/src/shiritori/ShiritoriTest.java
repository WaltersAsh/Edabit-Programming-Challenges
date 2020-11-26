package shiritori;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShiritoriTest {
  private static Shiritori my_shiritori = null;
  private static Shiritori my_shiritori2 = null;

  /**
   * @author edwardclark
   **/

  @BeforeClass
  public static void setUpClass() {
    my_shiritori = new Shiritori();
    my_shiritori2 = new Shiritori();
  }

  @Test
  public void test1() {
    Assert.assertEquals(false,my_shiritori.game_over);
  }

  @Test
  public void test2() {
    assertThat(my_shiritori.play("apple"), is(new String[]{"apple"}));
  }

  @Test
  public void test3() {
    assertThat(my_shiritori.getWords(), is(new String[]{"apple"}));
  }

  @Test
  public void test4() {
    assertThat(my_shiritori.play("ear"), is(new String[]{"apple", "ear"}));
  }

  @Test
  public void test5() {
    assertThat(my_shiritori.play("rhino"), is(new String[]{"apple", "ear", "rhino"}));
  }

  @Test
  public void test6() {
    assertThat(my_shiritori.play("ocelot"), is(new String[]{"apple", "ear", "rhino", "ocelot"}));
  }

  @Test
  public void test7() {
    //assertEquals(false,my_shiritori.game_over);
    assertThat(my_shiritori.game_over, is(false));
  }

  @Test
  public void test8() {
    System.out.println("does not follow Rule 1 (input word's first character = last words last character)");
    assertThat(my_shiritori.play("oops"), is("game over"));
  }

  @Test
  public void test9() {
    Assert.assertEquals(true, my_shiritori.game_over);
    assertThat(my_shiritori.getWords(), is(new String[]{"apple", "ear", "rhino", "ocelot"}));
  }

  @Test
  public void test10() {
    Assert.assertEquals("game restarted", my_shiritori.restart());
  }

  @Test
  public void test11() {
    assertThat(my_shiritori.getWords(), is(new String[]{}));
  }

  @Test
  public void test12() {
    Assert.assertEquals(false,my_shiritori.game_over);
  }

  @Test
  public void test13() {
    assertThat(my_shiritori2.play("hostess"), is(new String[]{"hostess"}));
  }

  @Test
  public void test14() {
    Assert.assertEquals(false,my_shiritori2.game_over);
  }

  @Test
  public void test15() {
    assertThat(my_shiritori2.play("stash"), is(new String[]{"hostess", "stash"}));
  }

  @Test
  public void test16() {
    assertThat(my_shiritori2.play("hostess"), is("game over"));
  }

  @Test
  public void test17() {
    assertThat(my_shiritori2.getWords(), is(new String[]{"hostess", "stash"}));
  }
}