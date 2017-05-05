/*Lawrence Pang
Oct 11 14
ICS203
Set 7 programs*/

import java.awt.*;
import hsa.Console;

public class Set_7
{
    static Console c;
    
    //************************************CheckDivision****************************
    public static void CheckDivision ()
    {
	double a,b,result;
	c.println("Enter a value for a");
	a=c.readDouble();
	c.println("Enter a value for b");
	b=c.readDouble();
	if (b!=0)
	{
	    result=a/b;
	    c.print("The result is ");
	    c.println(result,0,2);
	}
	else
	{
	    c.println("Error: Cannot divide by 0.");
	}
    }
    
    //************************************NumChars*********************************
    public static void NumChars ()
    {
	String wrd;
	int num,posn;
	c.println("Enter any word");
	wrd=c.readString();
	num=wrd.length();
	if (num%2!=0)
	{
	    c.println(wrd+" has an odd number of letters.");
	    posn=num/2+1;
	    c.println("The middle letter is at position "+posn);
	}
	else
	{
	    c.println(wrd+" has an even number of letters.");
	}
    }
    
    //***********************************MaxMinNum*********************************
    public static void MaxMinNum ()
    {
	int max,min,num;
	max=60;
	min=21;
	c.println("Enter any whole number: ");
	num=c.readInt();
	if (num>0)
	{
	    c.println("Your number "+num+" is larger than zero");
	}
	else
	{
	    c.println("Your number is negative or zero");
	}
	if (num>max)
	{
	    c.println("Your number "+num+" is larger than "+max);
	}
	if (num<min)
	{
	    c.println("Your number "+num+" is smaller than "+min);
	}
    }
    
    //************************************CheckDivision2***************************
    public static void CheckDivision2 ()
    {
	double a,b,result;
	c.println("Enter a value for a");
	a=c.readDouble();
	c.println("Enter a value for b");
	b=c.readDouble();
	if (b==0)
	{
	    c.println("Error: Cannot divide by 0."); 
	}
	else
	{
	    result=a/b;
	    c.print("The result is ");
	    c.println(result,0,2);
	}
    }
    
    //***********************************EvenOddNum********************************
    public static void EvenOddNum ()
    {
	int x;
	c.println("Enter an integer.");
	x=c.readInt();
	if (x%2==0)
	{
	    c.println("Your number is even.");
	}
	else
	{
	    c.println("Your number is odd.");
	}
	if (x%5==0)
	{
	    c.println("Your number is a multiple of 5.");
	    c.println("It is "+(x/5)+" times 5.");
	}
    }
    
    //*************************************Discount********************************
    public static  void Discount ()
    {
	double price;
	c.println("Enter the total price of the purchases.");
	price=c.readDouble();
	if (price>100)
	{
	    c.print("The final price, with discount, is ");
	    c.println(price*0.9,0,2);
	}
	else
	{
	    c.println("The final price is "+price);
	}
    }
    
    //*************************************TestNumber******************************
    public static void TestNumber ()
    {
	int x;
	c.println("Enter an integer.");
	x=c.readInt();
	c.println("Your number is "+x);
	if (x>0)
	{
	    c.print("It is positive, ");
	}
	else if (x<0)
	{
	    c.print("It is negative, ");
	}
	else
	{
	    c.print("It is ");
	}
	if (x%2==0)
	{
	    c.print("even, ");
	}
	else
	{
	    c.print("odd, ");
	}
	if (x%7==0)
	{
	    if (x>=0)
	    {
		if ((x/7)%10==1&&x!=77)
		{
		    c.println("and the "+(x/7)+"st multiple of 7.");
		}
		else if ((x/7)%10==2&&x!=84)
		{
		    c.println("and the "+(x/7)+"nd multiple of 7.");
		}
		else if ((x/7)%10==3&&x!=91)
		{
		    c.println("and the "+(x/7)+"rd multiple of 7.");
		}
		else
		{
		    c.println("and the "+(x/7)+"th multiple of 7.");
		}
	    }
	    else
	    {
		 c.println("and is 7 times "+(x/7));
	    }
	}
	else
	{
	    c.println("and is not a multiple of 7.");
	}
	if (Math.pow(x,2)>100)
	{
	    c.println("The square of your number is greater than 100.");
	}
	else
	{
	    c.println("The square of your number is less than 100.");
	}
    }
    
    //***********************************Driving***********************************
    public static void Driving ()
    {
	int age;
	c.println("Enter your age:");
	age=c.readInt();
	if (age<18)
	{
	    c.println("You are too young to drive.");
	}
	else if (age>75)
	{
	    c.println("Sorry, you are over the legal age limit for driving.");
	}
	else
	{
	    c.println("Age OK. Have you got a driver's license?");
	}
    }
    
    //*************************************MarkSymbol*******************************
    public static void MarkSymbol ()
    {
	double mark;
	c.println("Enter a percentage mark:");
	mark=c.readDouble();
	if (mark>=80)
	{
	    c.println("The mark is an A.");
	}
	else if (mark>=70&&mark<80)
	{
	    c.println("The mark is a B.");
	}
	else if (mark>=60&&mark<70)
	{
	    c.println("The mark is a C.");
	}
	else if (mark>=50&&mark<60)
	{
	    c.println("The mark is a D.");
	}
	else 
	{
	    c.println("The mark is an E.");
	}
    }
    
    //*********************************CompareNumChars*****************************
    public static void CompareNumChars ()
    {
	int l1,l2;
	String w1,w2;
	c.println("Type two words and press enter after each:");
	w1=c.readString();
	w2=c.readString();
	l1=w1.length();
	l2=w2.length();
	if (l2>l1)
	{
	    c.println("From shortest to longest, the words are "+w1+" and "+w2);
	}
	else if (l1>l2)
	{
	    c.println("From shortest to longest, the words are "+w2+" and "+w1);
	}
	else
	{
	    c.println("The words are "+w1+" and "+w2);
	}
    }
    
    //************************************SportingEvents***************************
    public static void SportingEvents ()
    {
	int year;
	c.println("Enter a year.");
	year=c.readInt();
	if (year>2014)
	{
	    if (year%4==0)
	    {
		c.println("The Olympics will be held in "+year);
	    }
	    else if (year%4==1)//The RtP text says that it's held two years after the leap year, but I googled this and it's actually one year
	    {
		c.println("The cricket world cup will be held in "+year);
	    }
	    else if (year%4==3)
	    {
		c.println("The rugby world cup will be held in "+year);
	    }
	    else 
	    {
		c.println("Neither the Olympics, nor the cricket world cup, nor the rugby world cup will be held in "+year);
	    }
	}
	if (year<=2014)
	{
	    if (year>=1896&&year%4==0)
	    {
		c.println("The Olympics was held in "+year);
	    }
	    else if (year>=1975&&year%4==1)//The RtP text says that it's held two years after the leap year, but I googled this and it's actually one year
	    {
		c.println("The cricket world cup was held in "+year);
	    }
	    else if (year>=1987&&year%4==3)
	    {
		c.println("The rugby world cup was held in "+year);
	    }
	    else  
	    {
		c.println("Neither the Olympics, nor the cricket world cup, nor the rugby world cup was held in "+year);
	    }
	}
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
	    c.println ("1 - CheckDivision");
	    c.println ("2 - NumChars");
	    c.println ("3 - MaxMinNum");
	    c.println ("4 - CheckDivision2");
	    c.println ("5 - EvenOddNum");
	    c.println ("6 - Discount");
	    c.println ("7 - TestNumber");
	    c.println ("8 - Driving");
	    c.println ("9 - MarkSymbol");
	    c.println ("10 - CompareNumChars");
	    c.println ("11 - SportingEvents");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();

	    if (choice == 1)
	    {
		c.clear();
		CheckDivision();
	    }
	    else
		if (choice == 2)
		{
		    c.clear();
		    NumChars();
		}
		else
		    if (choice == 3)
		    {
			c.clear();
			MaxMinNum();
		    }
		    else
			if (choice == 4)
			{
			    c.clear();
			    CheckDivision2();
			}
			else
			    if (choice == 5)
			    {
				c.clear();
				EvenOddNum();
			    }
			    else
				if (choice == 6)
				{
				    c.clear();
				    Discount();
				}
				else
				    if (choice == 7)
				    {
					c.clear();
					TestNumber();
				    }
				    else 
					if (choice == 8)
					{
					    c.clear();
					    Driving();
					}
					else
					    if (choice == 9)
					    {
						c.clear();
						MarkSymbol();
					    }
					    else
						if (choice == 10)
						{
						    c.clear();
						    CompareNumChars();
						}
						else
						    if (choice == 11)
						    {
							c.clear();
							SportingEvents();
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
