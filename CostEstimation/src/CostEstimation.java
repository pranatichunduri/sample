
/**
 * 
 * To find the cost estimation of a house
 * @author Pranati Chunduri
 *
 */
public class CostEstimation
{
	int cost;
	/**
	 * 
	 * @param materialstandard
	 * @param areaofhouse
	 * @param isautomated
	 * @return
	 */
	public double Cost(double materialstandard,double areaofhouse,boolean isautomated)
	{
		if(materialstandard==0)           // if standard materials are used
		{
			cost=1200;
			
		}
		else if(materialstandard==1)     // if above standard materials are used
		{
			cost=1500;
		}
		else if(materialstandard==2 && isautomated)    // if high standard materials and automated are used
		{
			cost=2500;
		}
		else
		{
			cost=1800;                        // if high standard materials are used
		}
		
		
		return cost*areaofhouse;   // returns the total cost
	}
}
