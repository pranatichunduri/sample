import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class interestTest {

	@Test
	void testSimpleinterest() 
	{ 
		interest i1=new interest();
		assertEquals(80,i1.simpleinterest(20,20,20));
	}
		
	

	

	@Test
	void testCompoundinterest() 
	{
		interest i2=new interest();
		assertEquals(22822.731155974223,i2.compoundinterest(20202,2.5f,5));
		
	}

}
