package demo5;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import demo5.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2017.02.09 15:37:12 // Generated by ComTest
 *
 */
public class LinjaAuto1Test {



  // Generated by ComTest BEGIN
  /** testLinjaAuto121 */
  @Test
  public void testLinjaAuto121() {    // LinjaAuto1: 21
    LinjaAuto1 a = new LinjaAuto1(31); 
    assertEquals("From: LinjaAuto1 line: 23", 31, a.getTilaa(), 0.000001); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetMaara33 */
  @Test
  public void testGetMaara33() {    // LinjaAuto1: 33
    LinjaAuto1 a = new LinjaAuto1(31); 
    assertEquals("From: LinjaAuto1 line: 35", 31, a.getTilaa(), 0.000001); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testVahenna47 */
  @Test
  public void testVahenna47() {    // LinjaAuto1: 47
    LinjaAuto1 a = new LinjaAuto1(31); 
    a.lisaa(4); 
    a.vahenna(3); 
    a.tulosta(System.out); assertEquals("From: LinjaAuto1 line: 51", "31,1,30"); 
  } // Generated by ComTest END
}