package orderEntryPhase1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class OrderEntryPhase1 
{
	// Instance variables
	private String itemNumber;
	private String itemDescription;
	private double itemPrice;
	
	private void getData()
	{
		// Declare Scanner object to get data
		Scanner input = new Scanner(System.in);
		
		//Get items for an order line
		System.out.print("Enter item number: ");
		itemNumber = input.nextLine();
		
		System.out.print("Enter item description: ");
		itemDescription = input.nextLine();
		
		try
		{
			System.out.print("Enter item price: $");
			itemPrice =input.nextDouble();
		}
		catch (InputMismatchException e)
		{
			System.out.println("Data entered is not valid currency. Program ending.");
		}
		catch (Exception e)
		{
			System.out.println("Error occurred");
		}
	}
	
	public String toString()
	{
		return ("\nOrder Details:\n" +
				"\nItem Number \tItem Description \tItem Price\n" +
				""+ itemNumber + 
				"\t\t" + itemDescription +
				"\t\t\t$" + itemPrice);
	}
	
	public static void main(String[] args) 
	{
		// Create new order
		OrderEntryPhase1 myOrder = new OrderEntryPhase1();
		
		// Get data for order
		myOrder.getData();
		
		// Display details for order
		System.out.println(myOrder.toString());
		
		

	}

}
