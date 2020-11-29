package medium.histogram;

/**
 =================================
 TestGen 3.1 for JUnit 4.13.0
 Test Case: Graph::histogram
 Timestamp: 10/21/2020 04:17:44 AM
 ---------------------------------
 ® DARKKO 2020 ©
 =================================

 **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HistogramTests {

  @Test
  public void test01() {
    assertEquals("oo\noooo\nooooo\noooooo", Histogram.histogram(new int[] {2,4,5,6}, "o"));
  }

  @Test
  public void test02() {
    assertEquals("****\n**", Histogram.histogram(new int[] {4,2}, "*"));
  }

  @Test
  public void test03() {
    assertEquals("HHHHHHHHHHHHHHHHHHHH\nH\nHHHHHHHHHHHH", Histogram.histogram(new int[] {20,1,12}, "H"));
  }

  @Test
  public void test04() {
    assertEquals("##\n#\n##\n####\n#####\n##\n###", Histogram.histogram(new int[] {2,1,2,4,5,2,3}, "#"));
  }

  @Test
  public void test05() {
    assertEquals("EEEEE\nEEE\nEEEEEEEEE\nEEEE", Histogram.histogram(new int[] {5,3,9,4}, "E"));
  }

  @Test
  public void test06() {
    assertEquals("XXXX\nXXX\nXX\nXXXXXX", Histogram.histogram(new int[] {4,3,2,6}, "X"));
  }

}
// end of tests