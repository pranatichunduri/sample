/**
 * 
 * @author Pranati Chunduri
 *
 */
public class interest {
	
	/**
	 * SIMPLE INTEREST
	 * @param principle
	 * @param timeperiod
	 * @param rateofinterest
	 * @return
	 */
	public double simpleinterest(double principle,double timeperiod,double rateofinterest)
	{
		return (principle*timeperiod*rateofinterest/100);
	}
	
	/**
	 * COMPOUND INTEREST
	 * @param principle
	 * @param timeperiod
	 * @param rateofinterest
	 * @return
	 */
	
	public double compoundinterest(double principle,double timeperiod,double rateofinterest)
	{
		return principle*(Math.pow((1+rateofinterest/100),timeperiod));
	}
	
}   // END OF THE CLASS interest
