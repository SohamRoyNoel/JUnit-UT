package UnitTestts.JunitUT;

public class MathUtils {

	// General JUnit Test
	public int add(int a, int b) {
		return a+b;
	}
	
	// Test Driven Development in JUnit
	public double areaOfCircle(double radious) {
		return 3.14*radious*radious;
	}
	
	// AssertThrows method : where we check if a method is throwing the correct exception
	public double divide(double n, double den) {
		return n/den;
	}
	
	// Repeated test
	public int square(int a) {
		return a*a;
	}
	
}
 