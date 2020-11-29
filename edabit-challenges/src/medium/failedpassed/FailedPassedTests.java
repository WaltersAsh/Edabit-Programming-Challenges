package medium.failedpassed;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FailedPassedTests {
  @Test
  public void test1() {
    assertEquals("You PASSED the Exam", FailedPassed.gradePercentage("85%", "85%"));
  }

  @Test
  public void test2() {
    assertEquals("You PASSED the Exam", FailedPassed.gradePercentage("99%","85%"));
  }

  @Test
  public void test3() {
    assertEquals("You FAILED the Exam", FailedPassed.gradePercentage("65%","90%"));
  }

  @Test
  public void test4() {
    assertEquals("You FAILED the Exam", FailedPassed.gradePercentage("65%","66%"));
  }

  @Test
  public void test5(){
    assertEquals("You PASSED the Exam", FailedPassed.gradePercentage("5%","5%"));
  }

  @Test
  public void test6(){
    assertEquals("You FAILED the Exam", FailedPassed.gradePercentage("5%","6%"));

  }

  @Test
  public void test7(){
    assertEquals("You PASSED the Exam", FailedPassed.gradePercentage("9%","6%"));
  }
}