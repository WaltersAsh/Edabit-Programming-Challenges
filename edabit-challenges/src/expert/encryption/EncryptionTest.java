package expert.encryption;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author edwardclark
 **/

public class EncryptionTest {
  @Test
  public void test1() {
    assertEquals("hae and via ecy", Encryption.encryption("haveaniceday"));
  }

  @Test
  public void test2() {
    assertEquals("fto ehg ee dd", Encryption.encryption("feedthedog"));
  }

  @Test
  public void test3() {
    assertEquals("clu hlt io", Encryption.encryption("chillout"));
  }

  @Test
  public void test4() {
    assertEquals("Anoea FdnSr oHeot oiyoe lsAnd aMrP.", Encryption.encryption("A Fool and His Money Are Soon Parted."));
  }

  @Test
  public void test5() {
    assertEquals("Onvtlphb. noehreae etraentc swttaech hohhddaa oriayann urnvhnng lygeadoe dosapttd", Encryption.encryption("One should not worry over things that have already happened and that cannot be changed."));
  }

  @Test
  public void test6() {
    assertEquals("Brpgatroea aeutpo,:dr cOlhessbrd knaartiaa. tertsamcw oismoriki Ssaentltn qayahoaog upinavrtb aonssetho", Encryption.encryption("Back to Square One is a popular saying that means a person has to start over, similar to: back to the drawing board."));
  }
}
