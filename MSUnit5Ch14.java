/**********************************************************************************
*MSUnit5Ch14.java
*Molina
*
*This program allows for selection of a cheese or meat pizza. If meat is selected,
*there are options for crust and ingredients. Then the order summary is printed.
*Polymorphism is implemented in this program because the setCrust and toString
*methods vary based on which type of Pizza is instantiated.
***********************************************************************************/

import java.util.Scanner;

public class MSUnit5Ch14
{
    public static void main(String[] args)
    {
		//get input for meat or cheese pizza
        System.out.print("What type of pizza would you like (Cheese or Meat): ");
        Scanner scan = new Scanner(System.in);
        String pizzaType = scan.nextLine();

		//Declare a single pizza to be used for both Cheese and Meat
		MSPizza pizza;


        if( pizzaType.equals("Meat"))
        {
			pizza = new MSPizza(); //zero arguments
			pizza.setCrust(); //asks user thick or thin
							  //and sets user input to crust
							  //(from MSPizza)

			pizza.setIngredients();//asks user for ingredient
								   //and sets user input to ingredient
								   //then sets cost to +$2
								   //(from MSPizza)

			System.out.println(pizza); //from MSPizza's toString

        }//end if

        else if(pizzaType.equals("Cheese"))
        {
            pizza = new MSCheese(); //zero arguments
            pizza.setCrust(); //sets to Thin, no option to change
            				  // from MSCheese's setCrust

      		System.out.println(pizza); //from MSCheese's toString
        }//end else if

    }//end main
}//end class