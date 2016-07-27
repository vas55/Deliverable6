import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SieveTest {
	
	@Test
	public void printSieveTest1() {
	int[] results;
	results = new int[] {};
		
	// As long as there are elements in the array,
	// print it.  Otherwise, print "BLANK".
		
	if (results.length != 0) {
    //System.out.print("> ");
    for (int j = 1; j < results.length;) {
		//System.out.print(results[j] + " ");
		j++;
    }
	} else {
		String blank = "BLANK";
		//System.out.println(blank);
		assertEquals("BLANK", blank);
	}
    }

	@Test
	public void printSieveTest2() {
	int count = 0;
	int[] results;
	results = new int[] {1,2,3,4,5,6,7,8,9,10};
		
	// As long as there are elements in the array,
	// print it.  Otherwise, print "BLANK".
		
	if (results.length != 0) {
    //System.out.print("> ");
    for (int j = 1; j < results.length;) {
		//System.out.print(results[j] + " ");
		j++;
		count = j;
    }
	} else {
		String blank = "BLANK";
		//System.out.println(blank);
	}
	assertEquals(results.length, count);
    }
}