/**********************************************************************************
*MSPizza.java
*Molina
*
*This class is the parent class to MSCheese. It sets the default pizza type to Meat
*and the default cost to $5.00.
***********************************************************************************/

import java.util.Scanner;

public class MSPizza
{
	//all instance variables are private
	private String pizzaType;
	private String crust;
	private double cost;
	private String ingredients;

	public MSPizza()
	{
		//set pizzaType to Meat and cost to $5
		pizzaType = "Meat";
		cost = 5.00;
	}

	public void setCrust()
	{
		//get input for thick or thin
		System.out.print("Thin or Thick Crust? ");
		Scanner scan = new Scanner(System.in);
		crust = scan.nextLine();
	}

	public void setIngredients()
	{
		//get input for ingredients
		System.out.print("What ingredient, sorry, only 1: ");
		Scanner scan = new Scanner(System.in);
		ingredients = scan.nextLine();
		setCost(); // once ingredients is set, do setCost (add $2)
	}

	public void setCost()
	{
		//add $2 to the initial cost which is $5
		this.cost = cost + 2.00;
	}

	public double getCost() //accessor method for MSCheese
	{
		return cost;
	}

	public String toString()
		{
			return "\nYou ordered:\n" + pizzaType + " pizza\n" +
						   ingredients + " (+$2.00)\n" +
						   crust + " crust\n" +
						   "Total cost of $" + cost + "0\n";
		}

}//end class MSPizza