/*Lawrence Pang
Oct 23 14
ICS203
Set 8 programs*/

import java.awt.*;
import hsa.Console;

public class PL_Set_8
{
    static Console c;

    //***********************************PrintChars********************************
    public static void PrintChars ()
    {
	//Display letters from Z to A with 3 spaces between each letter
	for (char ch = 'Z' ; ch >= 'A' ; ch--)
	{
	    c.print (ch + "   ");
	}
	c.println ();
	//Declare num (ASCII value of characters)
	int num = 31;
	//Display characters with ASCII code numbers from 32 to 126, amd code numbers
	for (char ch = 32 ; ch <= 126 ; ch++)
	{
	    num++;
	    c.print (ch, 5);
	    //Spacing for numbers
	    if (num < 100)
	    {
		c.print (num);
		c.print ("   ");
	    }
	    else if (num >= 100)
	    {
		c.print (num);
		c.print ("  ");
	    }
	}
	c.println ();
    }

    //***********************************PrintLbl**********************************
    public static void PrintLbl ()
    {
	//Display label
	for (int i = 0 ; i < 20 ; i++)
	{
	    c.print ("=");
	}
	c.println ();
	c.println ();
	c.print ("", (20 - "realcoolclothing".length ()) / 2);
	c.println ("realcoolclothing");
	c.print ("", (20 - "from".length ()) / 2);
	c.println ("from");
	c.print ("", (20 - "ETHNIK AFRIKA".length ()) / 2);
	c.println ("ETHNIK AFRIKA");
	c.println ();
	for (int i = 0 ; i < 20 ; i++)
	{
	    c.print ("=");
	}
	c.println ();
    }

    //***********************************PrintDiag*********************************
    public static void PrintDiag ()
    {
	//Display first pattern
	for (int i = 1 ; i <= 6 ; i++)
	{
	    c.println (7 - i, 7 - i);
	}
	//Prompt for character to continue
	c.println ("Press any key to continue: ");
	c.readChar ();
	c.clear ();
	//Display second pattern
	for (int i = 1 ; i <= 6 ; i++)
	{
	    c.println (i, 7 - i);
	}
	//Prompt for character to continue
	c.println ("Press any key to continue: ");
	c.readChar ();
	c.clear ();
	//Display third pattern
	for (int i = 1 ; i <= 6 ; i++)
	{
	    c.println (7 - i, i);
	}
	//Prompt for character to continue
	c.println ("Press any key to continue: ");
	c.readChar ();
	c.clear ();
	//Display fourth pattern
	for (char ch = 'A' ; ch <= 'F' ; ch++)
	{
	    if (ch != 'E')
	    {
		c.print ("", ch - 65);
		c.println (ch);
	    }
	    else
	    {
		c.println ("EEEEEE");
	    }
	}
    }

    //***********************************ConvertTemp*******************************
    public static void ConvertTemp ()
    {
	//Display conversion table
	c.println ("Centigrade on left, fahrenheit on right.");
	for (int cel = 100 ; cel < 123 ; cel++)
	{
	    //Values displayed by rows, not columns, although the numbers still increment by column
	    //This is much easier than trying to shift columns each time
	    for (int i = 0 ; i < 8 ; i++)
	    {
		if (cel + i * 23 <= 280)
		{
		    c.print (cel + i * 23, 0);
		    c.print ("-");
		    c.print (1.8 * (cel + i * 23) + 32, 0, 0);
		    c.print (" ");
		}
	    }
	    c.println ();
	}
    }

    //***********************************MaxNums***********************************
    public static void MaxNums ()
    {
	//Prompt for number of integers user will input
	c.println ("Enter the number of integers you will be inputting:");
	int numOfNums = c.readInt ();
	c.println ("Enter the integers:");
	//Prompt for user input for integers
	int num = c.readInt (); //This first step is necessary to avoid errors
	int max = num;
	//Find largest number
	for (int i = 1 ; i < numOfNums ; i++)
	{
	    num = c.readInt ();
	    if (max < num)
	    {
		max = num;
	    }
	}
	//Display largest number
	c.println ("The largest number is " + max);
    }

    //***********************************MinNums***********************************
    public static void MinNums ()
    {
	//Prompt for number of integers user will input
	c.println ("Enter the number of integers you will be inputting:");
	int numOfNums = c.readInt ();
	c.println ("Enter the integers:");
	//Prompt for user input for integers
	int num = c.readInt (); //This first step is necessary to avoid errors
	int min = num;
	//Find smallest number
	for (int i = 1 ; i < numOfNums ; i++)
	{
	    num = c.readInt ();
	    if (min > num)
	    {
		min = num;
	    }
	}
	//Display smallest number
	c.println ("The smallest number is " + min);
    }

    //***********************************BakedBeans********************************
    public static void BakedBeans ()
    {
	//Prompt for number of cans of beans user will input
	c.println ("Enter the number of cans of beans you will be inputting:");
	int numOfCans = c.readInt () + 1; //1 is added to maintain accuracy
	//Prompt for user to input brand and price of beans
	c.println ("Enter the brand and then the price, on separate lines, for each can:");
	//Declaration of price, brand, minimum price, and cheapest brand
	double min = 0;
	double price = 0;
	String cheapest = "";
	String brand = "";
	//Declaration of arrays to store lists of brands and prices
	//So all brands and prices can be displayed at once
	String[] brandList = new String [numOfCans];
	double[] priceList = new double [numOfCans];
	//Read brands and prices, find minimum price and cheapest brand
	for (int i = 1 ; i < numOfCans ; i++)
	{
	    brand = c.readLine ();
	    price = c.readDouble ();
	    //Enter the brands and prices into their respective arrays
	    brandList [i] = brand;
	    priceList [i] = price;
	    if (i == 1)
	    {
		min = price;
		cheapest = brand;
	    }
	    else if (min > price && i != 1)
	    {
		min = price;
		cheapest = brand;
	    }
	}
	c.clear ();
	//Display table of prices and brands
	c.print ("BRAND", 20);
	c.println ("PRICE ($)");
	for (int j = 1 ; j < numOfCans ; j++)
	{
	    c.print (brandList [j], 20);
	    c.println (priceList [j]);
	}
	//Display cheapest brand and price
	c.println ("The cheapest brand is " + cheapest + " at $" + min);
    }

    //***********************************FivePatterns******************************
    public static void FivePatterns ()
    {
	//Display first pattern
	for (int i = 1 ; i <= 4 ; i++)
	{
	    for (int j = 1 ; j <= i ; j++)
	    {
		c.print (j);
	    }
	    c.println ();
	}
	//Prompt for character to continue
	c.println ("Press any key to continue.");
	c.getChar ();
	c.clear ();
	//Display second pattern
	for (int i = 1 ; i <= 4 ; i++)
	{
	    for (int j = 1 ; j <= i ; j++)
	    {
		c.print (i);
	    }
	    c.println ();
	}
	//Prompt for character to continue
	c.println ("Press any key to continue.");
	c.getChar ();
	c.clear ();
	//Display third pattern
	for (int i = 1 ; i <= 4 ; i++)
	{
	    for (int j = 1 ; j <= i ; j++)
	    {
		c.print (i - j + 1);
	    }
	    c.println ();
	}
	//Prompt for character to continue
	c.println ("Press any key to continue.");
	c.getChar ();
	c.clear ();
	//Display fourth pattern
	int sum = 0;
	for (int i = 1 ; i <= 4 ; i++)
	{
	    sum = sum + i - 1;
	    for (int j = 1 ; j <= i ; j++)
	    {
		c.print (j + sum);
	    }
	    c.println ();
	}
	//Prompt for character to continue
	c.println ("Press any key to continue.");
	c.getChar ();
	c.clear ();
	//Display fifth pattern
	for (int i = 1 ; i <= 5 ; i++)
	{
	    for (int j = 1 ; j <= 5 ; j++)
	    {
		c.print (j + i - 1);
	    }
	    c.println ();
	}
    }

    //***********************************PercentTriangles**************************
    public static void PercentTriangles ()
    {
	//Display first pattern
	for (int i = 1 ; i <= 5 ; i++)
	{
	    for (int j = 1 ; j <= 2 * i - 1 ; j++)
	    {
		c.print ("%");
	    }
	    c.println ();
	}
	//Prompt for character to continue
	c.println ("Press any key to continue.");
	c.getChar ();
	c.clear ();
	//Display second pattern
	for (int i = 1 ; i <= 5 ; i++)
	{
	    c.print ("", 6 - i);
	    for (int j = 1 ; j <= 2 * i - 1 ; j++)
	    {
		c.print ("%");
	    }
	    c.println ();
	}
    }

    //***********************************Menu Program Here*************************
    public static void main (String[] args)
    {
	c = new Console ();

	//Variable declaration for user's choice
	int choice;

	do
	{
	    //Promting for choice

	    c.println ();
	    c.println ("Choose from the following menu\n");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9");
	    c.println ("1 - PrintChars");
	    c.println ("2 - PrintLbl");
	    c.println ("3 - PrintDiag");
	    c.println ("4 - ConvertTemp");
	    c.println ("5 - MaxNums");
	    c.println ("6 - MinNums");
	    c.println ("7 - BakedBeans");
	    c.println ("8 - FivePatterns");
	    c.println ("9 - PercentTriangles");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();

	    if (choice == 1)
	    {
		c.clear ();
		PrintChars ();
	    }
	    else
		if (choice == 2)
		{
		    c.clear ();
		    PrintLbl ();
		}
		else
		    if (choice == 3)
		    {
			c.clear ();
			PrintDiag ();
		    }
		    else
			if (choice == 4)
			{
			    c.clear ();
			    ConvertTemp ();
			}
			else
			    if (choice == 5)
			    {
				c.clear ();
				MaxNums ();
			    }
			    else
				if (choice == 6)
				{
				    c.clear ();
				    MinNums ();
				}
				else
				    if (choice == 7)
				    {
					c.clear ();
					BakedBeans ();
				    }
				    else
					if (choice == 8)
					{
					    c.clear ();
					    FivePatterns ();
					}
					else
					    if (choice == 9)
					    {
						c.clear ();
						PercentTriangles ();
					    }

	    c.print ("Press enter to continue");
	    c.getChar ();

	    c.clear ();
	    //This will loop until user enters 0
	}

	while (choice != 0);
	c.println ("The program has terminated");
    } //Main method
} //Menu Demo class


