/**********************************************************************************
*MSCheese.java
*Molina
*
*This class is a subclass of MSPizza. It sets the pizza type to cheese and the crust
* to thin. This setCrust() overrides the setCrust() in MSPizza. This toString()
*overrides the toString() in MSPizza.
***********************************************************************************/

public class MSCheese extends MSPizza
{
	String crust;
	String pizzaType;

	public MSCheese()
	{
		//set type to Cheese via constructor body
		pizzaType = "Cheese";
	}

	@Override
	public void setCrust()
	{
		//automatically set to thin
		crust = "Thin";
	}

	@Override
	public String toString()
	{
			return "\nYou ordered:\n" + pizzaType + " pizza\n" +
							   crust + " crust\n" +
							   "Total cost of $" + getCost() + "0\n";
	}

}//end class MSCheese