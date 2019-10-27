package UnitTestts.JunitUT;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


@TestInstance(Lifecycle.PER_CLASS)
public class MathUtilsTest {
	
	MathUtils mt;
	
	@BeforeEach
	public void init() {
		mt = new MathUtils();
	}
	

	// Nested Class : runs and groups test cases
	@Nested
	@DisplayName("Add method Testing")
	class AddTest {
		@Test
		@DisplayName("Test positive")
		public void test() {
			//MathUtils mt = new MathUtils();
			int expected = 52;
			int actual = mt.add(51, 1);
			assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Test Negative")
		public void testAdd() {
			//MathUtils mt = new MathUtils();
			int expected = -52;
			int actual = mt.add(-51, 1);
			assertEquals(expected, actual, "Ha ha ha Error");
		}
	}
	
	
	@Test
	@DisplayName("Testing Rotten Testicals")
	@EnabledOnOs(OS.WINDOWS) // Conditional execution
	public void testt() {
		//MathUtils mts = new MathUtils();
		boolean serverup = false;
		assumeTrue(serverup); // assuming this method is true; if not then just dont run it on some programatic condition :rathger same as enabeled or disabled but assumption allows to write code against some problematic situation
		assertEquals(314.0, mt.areaOfCircle(10));
	}
	
	// Repeated Test : runs the number of time it should run
	@RepeatedTest(30)
	public void squareTest(RepetitionInfo repetitionInfo) {
		System.out.println(repetitionInfo.getCurrentRepetition()); // returns the current repetation number
		assertEquals(25, mt.square(repetitionInfo.getCurrentRepetition()), () -> "Shit got failed"); // Supplier for assert messages  : lambda will be executed only if the test fails
	}
	
	// verifing the assertThrows exception
	@Test
	@Disabled
	public void divideTest() {
		//MathUtils mt = new MathUtils();
		assertThrows(ArithmeticException.class, ()->mt.divide(1.0, 0.0)); // accepts lambda exception
	}

}
