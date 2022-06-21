package MyTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	//Test for ignoring anything over 1000
	@Test
	void test() {
		 int length = StringCalculator.add("1,1000");
	        assertEquals(1, length);
	}
	
	//test for exceptions for negative numbers
	@Test
	void test2() {
		 
		 assertThrows(IllegalArgumentException.class,()->{StringCalculator.add("-1,2");});
	}
	
	
	

}
