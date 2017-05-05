/*Lawrence Pang
Sep 29 14
ICS203
Set 6 programs*/

import java.awt.*;
import hsa.Console;

public class Set_6
{
    static Console c;
    
    //*********************************Chocs***************************************
    public static void Chocs ()
    {
	String name;
	int number;
	c.println("Enter the name of the chocolate bar.");
	name=c.readLine();
	c.println("Enter the quantity of bars wanted.");
	number=c.readInt();
	c.clear();
	c.print("CHOC BAR",30);
	c.print("QUANTITY",30);
	c.println("COST");
	c.print(name,30);
	c.print(number);
	c.print("",29);
	c.print("$");
	c.print(number*0.99,0,2);
    }
    
    //*********************************PlayCosts***********************************
    public static void PlayCosts ()
    {
	int adult1,adult2,pupil1,pupil2;
	c.println("Enter the number of adults who attended the first night: ");
	adult1=c.readInt();
	c.println("Enter the number of adults who attended the second night: ");
	adult2=c.readInt();
	c.println("Enter the number of pupils who attended the first night: ");
	pupil1=c.readInt();
	c.println("Enter the number of pupils who attended the second night: ");
	pupil2=c.readInt();
	c.println("The total proceeds was $"+((adult1+adult2)*15+(pupil1+pupil2)*10));
	c.println("The profit made was $"+((adult1+adult2)*15+(pupil1+pupil2)*10-9000));
    }
    
    //*******************************NameAge***************************************
    public static void NameAge ()
    {
	String name;
	int birth;
	c.println("Enter your name: ");
	name=c.readLine();
	c.println("Enter your year of birth: ");
	birth=c.readInt();
	c.println();
	c.println(name+", you will be "+(2014-birth)+" years old this year.");
    }
    
    //***********************************Rings*************************************
    public static void Rings ()
    {
	c.setColor(Color.blue);
	c.drawOval(0,0,100,100);
	c.setColor(Color.black);
	c.drawOval(110,0,100,100);
	c.setColor(Color.red);
	c.drawOval(220,0,100,100);
	c.setColor(Color.yellow);
	c.drawOval(55,55,100,100);
	c.setColor(Color.green);
	c.drawOval(165,55,100,100);
    }
    
    //*********************************Supermarket*********************************
    public static void Supermarket ()
    {
	String product1,product2;
	double price1,price2;
	c.println("Enter the name of the first product: ");
	product1=c.readLine();
	c.println("Enter its price: ");
	price1=c.readDouble();
	c.println("Enter the name of the second product: ");
	product2=c.readLine();
	c.println("Enter its price: ");
	price2=c.readDouble();
	c.clear();
	c.println("Lawrence's supermarket");
	c.print(product1,20);
	c.println(price1,0,2);
	c.print(product2,20);
	c.println(price2,0,2);
	c.print("",20);
	c.println("------");
	c.print("TOTAL",20);
	c.print(price1+price2,0,2);
    }
    
    //********************************RoundedMarks*********************************
    public static void RoundedMarks ()
    {
	String name;
	double mark;
	c.println("Enter the name of the student: ");
	name=c.readLine();
	c.println("Enter his/her mark: ");
	mark=c.readDouble();
	c.clear();
	c.print("NAME",20);
	c.print("MARK OUT OF 43",20);
	c.println("ROUNDED %",20);
	c.print(name,20);
	c.print(mark);
	c.print("",16);
	c.print(mark/43*100,0,0);
    }
    
    //**********************************Swimmers***********************************
    public static void Swimmers ()
    {
	String name1,name2;
	double speed1,speed2;
	c.println("Enter the name of the first Olympic woman swimmer: ");
	name1=c.readLine();
	c.println("Enter her speed in seconds: ");
	speed1=c.readDouble();
	c.println("Enter the name of the second Olympic woman swimmer: ");
	name2=c.readLine();
	c.println("Enter her speed in seconds: ");
	speed2=c.readDouble();
	c.clear();
	c.println("100M BREASTSTROKE FINAL");
	c.println();
	c.print("NAME",25);
	c.println("TIME");
	c.print(name1,25);
	c.println(speed1,0,2);
	c.print(name2,25);
	c.println(speed2,0,2);
	c.println();
	c.print("Difference in times",25);
	c.print(speed2-speed1,0,2);
	c.print(" seconds");
    }
    
    //************************************MarkAverage******************************
    public static void MarkAverage ()
    {
	String name;
	double mark1,mark2;
	c.println("Enter the name of the student: ");
	name=c.readLine();
	c.println("Enter his/her mark on the test out of 25: ");
	mark1=c.readDouble();
	c.println("Enter his/her mark on the test out of 55: ");
	mark2=c.readDouble();
	c.clear();
	double total=mark1+mark2;
	double perc=total*100/(25+55);
	c.println();
	c.print(name+" got "+mark1+" out of 25 and "+mark2+" out of 55, so her final percentage is ");
	c.print(perc,0,0);
	c.println("%.");
    }
    
    //********************************FoodStall************************************
    public static void FoodStall ()
    {
	int coke,chip;
	double paid;
	c.println("Enter the number of Cokes you want: ");
	coke=c.readInt();
	c.println("Enter the number of packets of chips you want: ");
	chip=c.readInt();
	double price=coke*3+chip*2.5;
	c.print("You have to pay $");
	c.println(price,0,2);
	c.println("Enter the amount you have paid: ");
	paid=c.readDouble();
	c.print("Your change is $");
	c.println(paid-price,0,2);
    }
    
    //*********************************StarInBox***********************************
    public static void StarInBox ()
    {
	c.setColor(Color.blue);
	c.fillStar(190,190,220,220);
	c.setColor(Color.red);
	c.fillStar(200,200,200,200);
    }
    
    //*********************************ColdDrinks**********************************
    public static void ColdDrinks ()
    {
	int number,paid;
	c.println("Enter the number of cold drinks you want: ");
	number=c.readInt();
	c.clear();
	c.print("Number of cold drinks: ",20);
	c.println(number,10);
	c.print("Cost: ",20);
	c.println(number*1.89,10,2);
	c.println("The customer has paid (in whole dollars): ");
	paid=c.readInt();
	c.clear();
	c.print("Number of cold drinks: ",20);
	c.println(number,10);
	c.print("Cost: ",20);
	c.println(number*1.89,10,2);
	c.print("Change: ",20);
	c.println(paid-number*1.89,10,2);
    }
    
    //*********************************DiceThrow***********************************
    public static void DiceThrow ()
    {
	int diceroll=(int)(Math.random()*6)+1;
	c.print(diceroll);
    }
    
    //********************************RandomShapes*********************************
    public static void RandomShapes ()
    {
	//for this program I interpret "on top of" to mean one covers the other
	int rectx=(int)(Math.random()*640);
	int recty=(int)(Math.random()*500);
	int length=(int)(Math.random()*640);
	int width=(int)(Math.random()*500);
	int circlex=(int)(Math.random()*640);
	int circley=(int)(Math.random()*500);
	int radius=(int)(Math.random()*500);
	int rectred=(int)(Math.random()*255);
	int rectgreen=(int)(Math.random()*255);
	int rectblue=(int)(Math.random()*255);
	int circlered=(int)(Math.random()*255);
	int circlegreen=(int)(Math.random()*255);
	int circleblue=(int)(Math.random()*255);
	Color col=new Color(rectred,rectgreen,rectblue);
	c.setColor(col);
	c.fillRect(rectx,recty,length,width);
	col=new Color(circlered,circlegreen,circleblue);
	c.setColor(col);
	c.fillOval(circlex,circley,radius,radius);
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
	    c.println ("1 - NameAge");
	    c.println ("2 - Chocs");
	    c.println ("3 - Supermarket");
	    c.println ("4 - RoundedMarks");
	    c.println ("5 - PlayCosts");
	    c.println ("6 - Swimmers");
	    c.println ("7 - Rings");
	    c.println ("8 - MarkAverage");
	    c.println ("9 - Foodstall");
	    c.println ("10 - StarInBox");
	    c.println ("11 - ColdDrinks");
	    c.println ("12 - DiceThrow");
	    c.println ("13 - RandomShapes");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();

	    if (choice == 1)
	    {
		c.clear();
		NameAge();
	    }
	    else
		if (choice == 2)
		{
		    c.clear();
		    Chocs();
		}
		else
		    if (choice == 3)
		    {
			c.clear();
			Supermarket();
		    }
		    else
			if (choice == 4)
			{
			    c.clear();
			    RoundedMarks();
			}
			else
			    if (choice == 5)
			    {
				c.clear();
				PlayCosts();
			    }
			    else
				if (choice == 6)
				{
				    c.clear();
				    Swimmers();
				}
				else
				    if (choice == 7)
				    {
					c.clear();
					Rings();
				    }
				    else 
					if (choice == 8)
					{
					    c.clear();
					    MarkAverage();
					}
					else
					    if (choice == 9)
					    {
						c.clear();
						FoodStall();
					    }
					    else
						if (choice == 10)
						{
						    c.clear();
						    StarInBox();
						}
						else
						    if (choice == 11)
						    {
							c.clear();
							ColdDrinks();
						    }
						    else
							if (choice == 12)
							{
							    c.clear();
							    DiceThrow();
							}
							else
							    if (choice == 13)
							    {
								c.clear();
								RandomShapes();
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
