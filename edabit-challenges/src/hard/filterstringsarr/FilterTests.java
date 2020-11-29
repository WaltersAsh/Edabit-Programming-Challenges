package hard.filterstringsarr;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FilterTests {
  @Test
  public void test1() {
    assertThat(FilterStringsArr.filterArray(new String[]{"1", "2", "a", "b"}), is(new String[]{"1", "2"}));
  }

  @Test
  public void test2() {
    assertThat(FilterStringsArr.filterArray(new String[]{"1", "a", "b", "0", "15"}), is(new String[]{"1", "0", "15"}));
  }

  @Test
  public void test3() {
    assertThat(FilterStringsArr.filterArray(new String[]{"1", "2", "aasf", "1", "123", "123"}), is(new String[]{"1", "2", "123"}));
  }

  @Test
  public void test4() {
    assertThat(FilterStringsArr.filterArray(new String[]{"jsyt", "4", "yt", "6"}), is(new String[]{"4","6"}));
  }

  @Test
  public void test5() {
    assertThat(FilterStringsArr.filterArray(new String[]{"r", "5", "y", "e", "8", "9"}), is(new String[]{"5", "8", "9"}));
  }

  @Test
  public void test6() {
    assertThat(FilterStringsArr.filterArray(new String[]{"a", "e", "i", "o", "u"}), is(new String[]{}));
  }

  @Test
  public void test7() {
    assertThat(FilterStringsArr.filterArray(new String[]{"4", "z", "f", "5"}), is(new String[]{"4", "5"}));
  }

  @Test
  public void test8() {
    assertThat(FilterStringsArr.filterArray(new String[]{"abc", "123"}), is(new String[]{"123"}));
  }

  @Test
  public void test9() {
    assertThat(FilterStringsArr.filterArray(new String[]{"$%^", "567", "&&&"}), is(new String[]{"567"}));
  }

  @Test
  public void test10() {
    assertThat(FilterStringsArr.filterArray(new String[]{"w", "r", "u", "43", "s", "a", "76", "d", "88"}), is(new String[]{"43", "76", "88"}));
  }
}