/**
 * 
 */
package in.jaiprakash;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * @author Jai Prakash
 * Email: prakashjai01@gmail.com
 *
 */
public class CaesarShiftTest {

	@Test
	public void testSomethingOnAnEmptyString(){
		// i always want the simplest thing first
		//Encryption
		//Shift 0
		//Empty String
		
		//Question: How do i want to design the API
		
		//1.Instance?
		//CaesarShift cs = new CaesarShift();
		//cs.encode(0,"")
		
		//Instance, with shift in constructor?
		//CaesarShift cs = new CaesarShift(0); //same shift
		//cs.encode("");
		//cs.decode("");
		
		//3. static call?
		//CaesarShift.encode(0, "");
		
		//let us start with option 2
		CaesarShift cs = new CaesarShift(0);
		assertEqual("", cs.encode(""));
		
	}
	
	@Test
	public void testNullString(){
		CaesarShift cs = new CaesarShift(0);
		try{
			cs.encode(null);
			fail("This line should never be executed");
		}catch (NullPointerException | IllegalArgumentException e){
			assertTrue(true);
		}
		
	}
	
	public void testSingleLetterShiftOf0(){
		
	}

	/**
	 * @param string
	 * @param encode
	 */
	private void assertEqual(String string, Object encode) {
		// TODO Auto-generated method stub
		
	}
}
