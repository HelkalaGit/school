package demo4;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import static demo4.Demopisteet.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2017.02.01 18:46:45 // Generated by ComTest
 *
 */
public class DemopisteetTest {



  // Generated by ComTest BEGIN
  /** testDemopisteet50 */
  @Test
  public void testDemopisteet50() {    // Demopisteet: 50
    assertEquals("From: Demopisteet line: 51", 4, demopisteet(40,56,1)); 
    assertEquals("From: Demopisteet line: 52", 0, demopisteet(22,56,1)); 
    assertEquals("From: Demopisteet line: 53", 6, demopisteet(55,56,1)); 
    assertEquals("From: Demopisteet line: 54", 10, demopisteet(32,40,2)); 
  } // Generated by ComTest END
}