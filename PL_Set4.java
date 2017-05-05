/*Lawrence Pang
Sep 22 14
ICS203
Set 4 programs*/

import java.awt.*;
import hsa.Console;

public class MenuDemo_Sep10_14
{
    static Console c;
    
//***********************************MakeLabels********************************
    public static void MakeLabels ()
    {
	String subject, name;
	c.println("Type in the name and <Enter>");
	name=c.readLine();
	c.println("Type in the subject and <Enter>");
	subject=c.readLine();
	c.println();
	c.println("*********************");
	c.println("Name: " + name);
	c.println("Subject: " + subject);
	c.println("*********************");
    }

//*********************************InOutWord***********************************
    public static void InOutWord ()
    {
	String word;
	c.println("Type in any word, then <Enter>");
	word=c.readString();
	c.println();
	c.println("The word that was inputted is " + word);
    }

//*********************************SchoolInfo**********************************
    public static void SchoolInfo ()
    {
	//This program is not required
	String name, school, grade;
	c.println("Type in your name, then <Enter>");
	name=c.readLine();
	c.println("Type in your school's name, then <Enter>");
	school=c.readLine();
	c.println("Type in your grade, then <Enter>");
	grade=c.readLine();
	c.println("\t\t\t\t\tName: " + name);
	c.println("\t\t\t\t\tSchool: " + school);
	c.println("\t\t\t\t\tGrade: " + grade);
    }

//**********************************InputRect**********************************
    public static void InputRect ()
    {
	int length, breadth;
	c.println("RECTANGLE PROGRAM");
	c.print("Type in the length of the rectangle and <Enter>: ");
	length=c.readInt();
	c.print("Type in the breadth of the rectangle and <Enter>: ");
	breadth=c.readInt();
	c.setColor(Color.green);
	c.fillRect(100,100,length,breadth);
    }

//*********************************InputReals*********************************
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
    }
    
//**********************************PersonalDetails****************************
    public static void PersonalDetails ()
    {
	String firstName,surname,phoneNumber;
	int birth;
	double height;
	char classLetter;
	c.println("Enter your first name:");
	firstName=c.readString();
	c.println("Enter your last name:");
	surname=c.readString();
	c.println("Enter your phone number:");
	phoneNumber=c.readString();
	c.println("Enter your year of birth:");
	birth=c.readInt();
	c.println("Enter your height in metres:");
	height=c.readDouble();
	c.println("Enter the letter of the class you are in this year:");
	classLetter=c.readChar();
	c.clear();
	c.println("PERSONAL DETAILS");
	c.println();
	c.println("NAME: " + firstName + " " + surname);
	c.println("YEAR OF BIRTH: " + birth);
	c.print("HEIGHT(m): ");
	c.println(height,0,1);
	c.println("TELEPHONE NUMBER: " + phoneNumber);
	c.println("GRADE 10: " + (classLetter));
    }

//*********************************ColoredCircles******************************
    public static void ColoredCircles ()
    {
	int dm1,dm2,red,green,blue;
	c.println("This program displays two circles");
	c.println("Enter the diameter of the first circle in pixels (between 100 and 300):");
	dm1=c.readInt();
	c.println("Enter the diameter of the second circle in pixels (between 50 and 150):");
	dm2=c.readInt();
	c.println("Enter the red value of the circles' color (between 0 and 255):");
	red=c.readInt();
	c.println("Enter the green value of the circles' color (between 0 and 255):");
	green=c.readInt();
	c.println("Enter the blue value of the circles' color (between 0 and 255):");
	blue=c.readInt();
	Color col=new Color(red,green,blue);
	c.setColor(col);
	c.fillOval(100,200,dm1,dm1);
	c.fillOval(500,200,dm2,dm2);
    }
    
//**********************************Prices*************************************
    public static void Prices ()
    {
	String product1,product2,product3;
	double price1,price2,price3;
	c.println("Enter the name of the first product:");
	product1=c.readString();
	c.println("Enter its price:");
	price1=c.readDouble();
	c.println("Enter the name of the second product:");
	product2=c.readString();
	c.println("Enter its price:");
	price2=c.readDouble();
	c.println("Enter the name of the third product:");
	product3=c.readString();
	c.println("Enter its price:");
	price3=c.readDouble();
	c.println();
	c.println("SHOPPING LIST");
	c.print(product1,20);
	c.println(price1,20);
	c.print(product2,20);
	c.println(price2,20);
	c.print(product3,20);
	c.println(price3,20);
    }

//*********************************InputChars**********************************
    public static void InputChars ()
    {
	char ch1,ch2,ch3;
	c.println("Type in any three characters.");
	ch1=c.getChar();
	ch2=c.getChar();
	ch3=c.getChar();
	c.println();
	c.print("Together these three letters spell: " + ch1 + ch2 + ch3);
    }
    
//********************************Overwrite************************************
    public static void Overwrite ()
    {
	String name;
	c.println("Enter a name:");
	name=c.readString();
	c.println("Enter another name:");
	name=c.readString();
	c.println("The name is " + name);
    }
    
//***********************************AdditionalProgram*************************
    public static void AdditionalProgram ()
    {
	char char1,char2,char3;
	c.println("Type in any three cahracters on the keyboard");
	char1=c.getChar();
	char2=c.getChar();
	char3=c.getChar();
	c.print("The ASCII number for letter " + char1 + " is ");
	c.println(0 + char1);
	c.print("The ASCII number for letter " + char2 + " is ");
	c.println(0 + char2);
	c.print("The ASCII number for letter " + char3 + " is ");
	c.println(0 + char3);
	c.print("Together these 3 letters add up to: ");
	c.print(char1 + char2 + char3);
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
	    c.println ("1 - MakeLabels");
	    c.println ("2 - InOutWord");
	    c.println ("3 - InputRect");
	    c.println ("4 - InputReals");
	    c.println ("5 - PersonalDetails");
	    c.println ("6 - ColoredCircles");
	    c.println ("7 - Prices");
	    c.println ("8 - InputChars");
	    c.println ("9 - Overwrite");
	    c.println ("10 - AdditionalProgram");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();

	    if (choice == 1)
	    {
		c.clear ();
		MakeLabels();
	    }
	    else
		if (choice == 2)
		{
		    c.clear ();
		    InOutWord();
		}
		else
		    if (choice == 3)
		    {
			c.clear ();
			InputRect();
		    }
		    else
			if (choice == 4)
			{
			    c.clear();
			    InputReals();
			}
			else
			    if (choice == 5)
			    {
				c.clear ();
				PersonalDetails();
			    }
			    else
				if (choice == 6)
				{
				    c.clear ();
				    ColoredCircles();
				}
				else
				    if (choice == 7)
				    {
					c.clear ();
					Prices();
				    }
				    else 
					if (choice == 8)
					{
					    c.clear ();
					    InputChars();
					}
					else
					    if (choice == 9)
					    {
						c.clear ();
						Overwrite();
					    }
					    else
						if (choice == 10);
						{
						    c.clear ();
						    AdditionalProgram();
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
