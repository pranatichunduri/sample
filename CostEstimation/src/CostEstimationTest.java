
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostEstimationTest
{

	@Test
	void testCost()
	{
		CostEstimation ce=new CostEstimation();
		assertEquals(2400.0,ce.Cost(0,2,true));    // pass case
		assertEquals(2123.0,ce.Cost(0,2,true));    // fail case
				
	}

}
