/*Lawrence Pang
Sep 11 14
ICS203
Set 1/2 programs*/

import java.awt.*;
import hsa.Console;

public class MenuDemo_Sep10_14
{
    static Console c;

//***********************************FieldWidths*******************************

    public static void FieldWidths ()
    {
	c.print("1234567890");
	c.println("123456789012345");
	c.print("Hello",6);
	c.print("Hello",6);
	c.print("Hello",6);
	c.print("Hello");
	c.println();
	c.println();
	c.print("Hello",2);
	c.print("Hello",2);
	c.print("Hello");
    }
	
//**********************************Music**************************************

    public static void Music ()
    {
	c.println("123456789012345");
	c.println("  Rock and Roll");
	c.println("      Metal");
	c.println();
	c.println("    The Blues");
    }
    
//***********************************NameAndAddress***************************

    public static void NameAndAddress ()
    {
	c.println("\t\t\t\tNAME AND ADDRESS");
	c.println();
	c.println("\t\t\t\tLawrence Pang");
	c.println("\t\t\t\t38 Raymond Bartlett Avenue");
	c.println("\t\t\t\tMarkham");
	c.println("\t\t\t\tOntario");
	c.println("\t\t\t\tL3R 5H7");
    }
    
//**********************************PrintName**********************************

    public static void PrintName ()
    {
	c.println("My name is Lawrence Pang.");
	c.println("I am in Grade 10.");
	c.println("I attend Marc Garneau Collegiate Institute");
	c.println("I live in Markham.");
    }

//**********************************PrintOutput*******************************

    public static void PrintOutput ()
    {
	c.print("12345678901234567890 ");
	c.print("Hello ");
	c.print("How are you");
	c.println("XXXXXXXXXXXXXXX");
    }

//***********************************PrintOutputb*****************************

    public static void PrintOutputb ()
    {
	c.print("Hello. "+"How are you today?");
    }
    
//***********************************Shopping*********************************

    public static void Shopping ()
    {
	c.print("I am going");
	c.println("to the");
	c.println("shopping mall.");
	c.println();
	c.println("There is no bus");
	c.print("may I have a lift?");
    }
    
//**********************************VirusWarning******************************

    public static void VirusWarning ()
    {
	c.println("\t"+"WARNING"+"\n");
	c.println("\tPossible virus detected \n\tReboot and run antivirus software");
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
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8");
	    c.println ("1 - FieldWidths");
	    c.println ("2 - Music");
	    c.println ("3 - NameAndAddress");
	    c.println ("4 - PrintName");
	    c.println ("5 - PrintOutput");
	    c.println ("6 - PrintOutputb");
	    c.println ("7 - Shopping");
	    c.println ("8 - VirusWarning");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();

	    if (choice == 1)
	    {
		c.clear ();
		FieldWidths();
	    }
	    else
		if (choice == 2)
		{
		    c.clear ();
		    Music();
		}
		else
		    if (choice == 3)
		    {
			c.clear ();
			NameAndAddress();
		    }
		    else
			if (choice == 4)
			{
			    c.clear();
			    PrintName();
			}
			else
			    if (choice == 5)
			    {
				c.clear ();
				PrintOutput();
			    }
			    else
				if (choice == 6)
				{
				    c.clear ();
				    PrintOutputb();
				}
				else
				    if (choice == 7)
				    {
					c.clear ();
					Shopping();
				    }
				    else
					if (choice == 8)
					{
					    c.clear ();
					    VirusWarning();
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


