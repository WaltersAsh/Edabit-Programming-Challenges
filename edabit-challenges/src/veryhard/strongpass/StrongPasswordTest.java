package veryhard.strongpass;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StrongPasswordTest {
  /**
   * @author edwardclark
   */

    @Test
    public void test1() {
      assertEquals(1, StrongPassword.strongPassword("#Edabit"));
    }

    @Test
    public void test2() {
      assertEquals(1, StrongPassword.strongPassword("Cr3ateAStr0ng1"));
    }

    @Test
    public void test3() {
      assertEquals(2, StrongPassword.strongPassword("CreateAStrongOne"));
    }

    @Test
    public void test4() {
      assertEquals(3, StrongPassword.strongPassword("willthispass"));
    }

    @Test
    public void test5() {
      assertEquals(1, StrongPassword.strongPassword("w1llth!spass?"));
    }

    @Test
    public void test6() {
      assertEquals(0, StrongPassword.strongPassword("W1llth!spass?"));
    }

    @Test
    public void test7() {
      assertEquals(1, StrongPassword.strongPassword("1sth!"));
    }

    @Test
    public void test8() {
      assertEquals(2, StrongPassword.strongPassword("sth!"));
    }

    @Test
    public void test9() {
      assertEquals(4, StrongPassword.strongPassword("bd"));
    }

    @Test
    public void test10() {
      assertEquals(5, StrongPassword.strongPassword("d"));
    }

    @Test
    public void test11() {
      assertEquals(4, StrongPassword.strongPassword("[?"));
    }
}
