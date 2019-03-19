import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAOperations {

	@Test
	void testAddition() {
		AOperation a=new AOperation();
		assertEquals(10,a.Addition(5,5));
	}

	@Test
	void testMultiplication() 
	{
		AOperation m=new AOperation();
		assertEquals(25,m.Multiplication(25, 1));
	}

	@Test
	void testDivision() 
	{
		AOperation d=new AOperation();
		assertEquals(2,d.Division(40,20));
		
	}

}
