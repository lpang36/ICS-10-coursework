/*Lawrence Pang
Sep 22 14
ICS203
Set 5 programs*/

import java.awt.*;
import hsa.Console;

public class Set_5
{
    static Console c;
    
    //**********************************InputReals*********************************
    public static void InputReals ()
    {
	double num1,num2;
	c.println("Type in a real number and <Enter>: ");
	num1=c.readDouble();
	c.println("Type in a real number and <Enter>: ");
	num2=c.readDouble();
	c.println();
	c.print("The first real number entered was ");
	c.println(num1,0,3);
	c.print("The second real number entered was ");
	c.println(num2,0,3);
	c.println();
	c.println("The sum of the 2 numbers is ");
	c.println((num1 + num2),0,1);
	c.println("The difference of the 2 numbers is ");
	c.println((num1 - num2),0,1);
	c.println("The product of the 2 numbers is ");
	c.println((num1 * num2),0,1);
    }
    
    //**********************************Division***********************************
    public static void Division ()
    {
	c.println("REAL NUMBER DIVISION");
	c.println();
	double num1,num2;
	c.println("Type in a real number and <Enter>: ");
	num1=c.readDouble();
	c.println("Type in a real number and <Enter>: ");
	num2=c.readDouble();
	c.println();
	c.println(num1 + " divided by " + num2 + " is ");
	c.println((num1/num2),0,3);
    }
    
    //**********************************Modulus************************************
    public static void Modulus ()
    {
	c.println("FINDING THE REMAINDER");
	c.println();
	double num1,num2;
	c.println("Type in a real number and <Enter>: ");
	num1=c.readDouble();
	c.println("Type in a real number and <Enter>: ");
	num2=c.readDouble();
	c.println();
	c.println("The remainder when " + num1 + " is divided by " + num2 + " is " + (num1%num2));
    }
    
    //**********************************Incrementing*******************************
    public static void Incrementing ()
    {
	int num1,num2;
	num1=7;
	num2=10;
	c.println("The first integer is " + num1);
	c.println("The second integer is " + num2);
	num1++;
	num2++;
	c.println("After incrementing:");
	c.println("The first integer is now " + num1);
	c.println("The second integer is now " + num2);
    }
    
    //**********************************ThreeWords*********************************
    public static void ThreeWords ()
    {
	String name1,name2,name3;
	c.println("Type in anything and <Enter>: ");
	name1=c.readLine();
	c.println("Type in anything and <Enter>: ");
	name2=c.readLine();
	c.println("Type in anything and <Enter>: ");
	name3=c.readLine();
	c.println(name1+" has "+name1.length()+" characters in it");
	c.println(name2+" has "+name2.length()+" characters in it");
	c.println(name3+" has "+name3.length()+" characters in it");
	c.println("The total number of characters in the three strings is "+(name1.length()+name2.length()+name3.length()));
    }
    
    //***********************************NumberOfDigits****************************
    public static void NumberOfDigits ()
    {
	String number;
	c.println("Type in a whole number and <Enter>: ");
	number=c.readLine();
	c.println(number+" has "+number.length()+" characters in it");
    }
    
    //**********************************Marks**************************************
    public static void Marks ()
    {
	String name1,name2,name3;
	int mark1,mark2,mark3;
	c.println("Type in the first pupil's name and <Enter>: ");
	name1=c.readLine();
	c.println("Type in the pupil's mark and <Enter>: ");
	mark1=c.readInt();
	c.println("Type in the second pupil's name and <Enter>: ");
	name2=c.readLine();
	c.println("Type in the pupil's mark and <Enter>: ");
	mark2=c.readInt();
	c.println("Type in the third pupil's name and <Enter>: ");
	name3=c.readLine();
	c.println("Type in the pupil's mark and <Enter>: ");
	mark3=c.readInt();
	c.print(name1);
	c.println(mark1,40-name1.length());
	c.print(name2);
	c.println(mark2,40-name2.length()); 
	c.print(name3);
	c.println(mark3,40-name3.length());  
    }
    
    //**********************************ShoppingList*******************************
    public static void ShoppingList ()
    {
	String product1,product2,product3,product4;
	double price1,price2,price3,price4;
	c.println("Type in the first product and <Enter>: ");
	product1=c.readLine();
	c.println("Type in the price and <Enter>: ");
	price1=c.readDouble();
	c.println("Type in the second product and <Enter>: ");
	product2=c.readLine();
	c.println("Type in the price and <Enter>: ");
	price2=c.readDouble();
	c.println("Type in the third product and <Enter>: ");
	product3=c.readLine();
	c.println("Type in the price and <Enter>: ");
	price3=c.readDouble();
	c.println("Type in the fourth product and <Enter>: ");
	product4=c.readLine();
	c.println("Type in the price and <Enter>: ");
	price4=c.readDouble();
	c.clear();
	c.println("\t\t\tSHOPPING LIST");
	c.print(product1);
	c.println(price1,50-product1.length(),2);
	c.print(product2);
	c.println(price2,50-product2.length(),2);
	c.print(product3);
	c.println(price3,50-product3.length(),2);
	c.print(product4);
	c.println(price4,50-product4.length(),2);
	c.println("\t\t\t\t\t     --------");
	c.print("TOTAL");
	c.println((price1+price2+price3+price4),50-"TOTAL".length(),2);
    }
    
    //**********************************CentreDisplay******************************
    public static void CentreDisplay ()
    {
	String sent;
	c.println("Enter any sentence: ");
	sent=c.readLine();
	c.println("12345678901234567890123456789012345678901234567890123456789012345678901234567890");
	c.print(" ",40-sent.length()/2);
	c.println(sent);
    }
    
    //***********************************Flyer*************************************
    public static void Flyer ()
    {
	c.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
	c.print(" ",27-"ETHNIK".length()/2);
	c.println("ETHNIK");
	c.print(" ",27-"AFRIKA".length()/2);
	c.println("AFRIKA");
	c.print(" ",27-"Ethnic gear at low prices".length()/2);
	c.println("Ethnic gear at low prices");
	c.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
	c.print("WEDNESDAY",54-"Fleamarket".length());
	c.println("Fleamarket");
	c.print("SATURDAY",54-"Bruma Lake".length());
	c.println("Bruma Lake");
	c.print("SUNDAY",54-"Stand 43".length());
	c.println("Stand 43");
	c.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
    }
    
    //**********************************ComputerMenu*******************************
    public static void ComputerMenu ()
    {
	String line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13;
	line1="MEGABYTE MENU";
	line2="STARTERS";
	line3="Hot keys - hot Mexican chili chips";
	line4="Data - be surprised and try this starter";
	line5="Bugs - deep fried crickets, a Thai delicacy";
	line6="Cookies - chocolate chip";
	line7="MAIN COURSE";
	line8="Root directory - vegetarian platter";
	line9="RAM - grilled to perfection in BBQ sauce";
	line10="Spam - meat in a can";
	line11="DRINKS";
	line12="Tabs - caffeine-free, sugar-free cola";
	line13="Copy - imitation fruit juice";
	c.print(" ",50-line1.length()/2);
	c.println(line1);
	c.print(" ",50-line2.length()/2);
	c.println(line2);
	c.print(" ",50-line3.length()/2);
	c.println(line3);
	c.print(" ",50-line4.length()/2);
	c.println(line4);
	c.print(" ",50-line5.length()/2);
	c.println(line5);
	c.print(" ",50-line6.length()/2);
	c.println(line6);
	c.print(" ",50-line7.length()/2);
	c.println(line7);
	c.print(" ",50-line8.length()/2);
	c.println(line8);
	c.print(" ",50-line9.length()/2);
	c.println(line9);
	c.print(" ",50-line10.length()/2);
	c.println(line10);
	c.print(" ",50-line11.length()/2);
	c.println(line11);
	c.print(" ",50-line12.length()/2);
	c.println(line12);
	c.print(" ",50-line13.length()/2);
	c.println(line13);
    }
    
    //**********************************VarValues**********************************
    public static void VarValues ()
    {
	int num1,num2,num3;
	num1=7;
	num2=15;
	c.println("Type in any integer and <Enter>: ");
	num3 = c.readInt();
	c.println();
	c.println("The first integer is "+num1);
	c.println("The second integer is "+num2);
	c.println("The third integer is "+num3);
	int sum=num1+num2+num3;
	c.println("The sum of the 3 integers is "+sum);
	int product=num1*num2*num3;
	c.println("The product of the 3 integers is "+product);
    }
    
    //**********************************Eggs***************************************
    public static void Eggs ()
    {
	int eggs;
	c.println("Type in the number of eggs and <Enter>: ");
	eggs=c.readInt();
	c.print("The number of full dozens of eggs in the box is ");
	c.println(eggs%12);
    }
    
    //*********************************Date100*************************************
    public static void Date100 ()
    {
	int yyyy;
	c.println("Type in the date in the form YYYY and <Enter>: ");
	yyyy=c.readInt();
	int last2=yyyy%100;
	int first2=(yyyy-last2)/100;
	first2++;
	c.print("The date in 100 years will be");
	c.println(" "+first2+last2);
    }
	
    //***********************************Menu Program Here*************************
    public static void main (String[] args)
    {

	c = new Console ();

	//variable delclaration for user's choice
	int choice;

	do
	{
	    //Promting for choice

	    c.println ();
	    c.println ("Choose from the following menu\n");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
	    c.println ("1 - InputReals");
	    c.println ("2 - Division");
	    c.println ("3 - Modulus");
	    c.println ("4 - Incrementing");
	    c.println ("5 - ThreeWords");
	    c.println ("6 - NumberOfDigits");
	    c.println ("7 - Marks");
	    c.println ("8 - ShoppingList");
	    c.println ("9 - CentreDisplay");
	    c.println ("10 - Flyer");
	    c.println ("11 - ComputerMenu");
	    c.println ("12 - VarValues");
	    c.println ("13 - Eggs");
	    c.println ("14 - Date100");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();

	    if (choice == 1)
	    {
		c.clear();
		InputReals();
	    }
	    else
		if (choice == 2)
		{
		    c.clear();
		    Division();
		}
		else
		    if (choice == 3)
		    {
			c.clear();
			Modulus();
		    }
		    else
			if (choice == 4)
			{
			    c.clear();
			    Incrementing();
			}
			else
			    if (choice == 5)
			    {
				c.clear();
				ThreeWords();
			    }
			    else
				if (choice == 6)
				{
				    c.clear();
				    NumberOfDigits();
				}
				else
				    if (choice == 7)
				    {
					c.clear();
					Marks();
				    }
				    else 
					if (choice == 8)
					{
					    c.clear();
					    ShoppingList();
					}
					else
					    if (choice == 9)
					    {
						c.clear();
						CentreDisplay();
					    }
					    else
						if (choice == 10)
						{
						    c.clear();
						    Flyer();
						}
						else
						    if (choice == 11)
						    {
							c.clear();
							ComputerMenu();
						    }
						    else
							if (choice == 12)
							{
							    c.clear();
							    VarValues();
							}
							else
							    if (choice == 13)
							    {
								c.clear();
								Eggs();
							    }
							    else
								if (choice == 14)
								{
								    c.clear();
								    Date100();
								}
	c.print ("Press enter to continue");
	c.getChar ();
	
	c.clear ();
	    //This will loop until user enters 0
	}

	while (choice != 0);
	c.println ("The program has terminated");
	// Place your program here.  'c' is the output console
    } // main method
} // Menu Demo class
