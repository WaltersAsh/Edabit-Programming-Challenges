package expert.bitmapimgconv;

/**
 ==========================================
 TestGen 3.1 for JUnit 4.13.0
 Test Case: BitmapImage::convertToBitstring
 Timestamp: 11/28/2020 01:11:14 PM
 ------------------------------------------
 ® DARKKO 2020 ©
 ==========================================

 **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BitmapImageTest {

  @Test
  public void test01() {
    assertEquals("1110111000101010110101000101010101101011100011101111010001010001000111101110000010001", BitmapImage.convertToBitstring("05:44"));
  }

  @Test
  public void test02() {
    assertEquals("0100111000010011111000010101100001010011100001001110100100010010000111101110001110111", BitmapImage.convertToBitstring("12:13"));
  }

  @Test
  public void test03() {
    assertEquals("0100111000010011111000010101100001010011100001000010100100010010000111101110001110001", BitmapImage.convertToBitstring("12:17"));
  }

  @Test
  public void test04() {
    assertEquals("1110100000101010010101000101010100101011100011101111010101010001010111101110000010111", BitmapImage.convertToBitstring("06:46"));
  }

  @Test
  public void test05() {
    assertEquals("1110101000111010010101010101000100101011100011101111010001010001010111100010001110111", BitmapImage.convertToBitstring("04:56"));
  }

  @Test
  public void test06() {
    assertEquals("0100111000111011111001010100010101010011100011101010100001010100010111100010001110111", BitmapImage.convertToBitstring("19:20"));
  }

  @Test
  public void test07() {
    assertEquals("0100111000111011111000010100010101010000100011101110100001010100000111100010001110001", BitmapImage.convertToBitstring("17:29"));
  }

  @Test
  public void test08() {
    assertEquals("0100111000010011111000010101100001010000100001001110100001010010000111100010001110111", BitmapImage.convertToBitstring("17:13"));
  }

  @Test
  public void test09() {
    assertEquals("1110111000101011100101010101010101111010100011101011000101010001010111101110000010111", BitmapImage.convertToBitstring("20:40"));
  }

  @Test
  public void test10() {
    assertEquals("1110111000111011110100010101000101101000100011101111010001010001010111100010001110111", BitmapImage.convertToBitstring("07:58"));
  }

  @Test
  public void test11() {
    assertEquals("0100010000111011111001100101010101010001000010101110100010010101010111101110001110111", BitmapImage.convertToBitstring("11:08"));
  }

  @Test
  public void test12() {
    assertEquals("1110111000010011110100010101100101101011100001001011010001010010010111101110001110111", BitmapImage.convertToBitstring("03:10"));
  }

}
// end of tests