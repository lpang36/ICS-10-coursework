/*Lawrence Pang
Sep 16 14
ICS203
Set 3 programs*/

import java.awt.*;
import hsa.Console;

public class MenuDemo_Sep10_14
{
    static Console c;
    
//There is no program BlueRect; it was replaced with Rectangle

//**********************************Rectangle**********************************
    public static void Rectangle ()
    {
	//Lawrence Pang, September 12, 2014
	c.setColor (Color.blue);
	c.fillRect (635,0,5,5);
	c.setColor (Color.red);
	c.fillRect (0,495,5,5);
	c.setColor (Color.green);
	c.fillRect (0,0,5,5);
	c.setColor (Color.yellow);
	c.fillRect (635,495,5,5);
	c.setColor (Color.pink);
	c.fillRect (320,250,5,5);
    }

//**********************************MyColors***********************************
    public static void MyColors ()
    {
	Color col=new Color(150,30,40);
	c.setColor(col);
	c.fillRect (200,200,200,200);
    }

//**********************************Circles************************************
    public static void Circles ()
    {
	//Lawrence Pang, September 12, 2014
	c.setColor (Color.magenta);
	c.drawOval(320,250,250,250);
    }

//***********************************House**************************************
    public static void House ()
    {
	c.setColor(Color.blue);
	c.fillRect(220,300,200,200);
	c.setColor(Color.green);
	c.fillRect(287,400,66,100);
	c.setColor(Color.yellow);
	c.fillRect(253,325,50,50);
	c.fillRect(337,325,50,50);
	c.setColor(Color.red);
	c.fillRect(170,250,300,50);
	c.fillRect(253,183,50,67);
	c.setColor(Color.black);
	c.drawOval(203,133,50,50);
	c.drawOval(153,83,50,50);
	c.drawOval(103,33,50,50);
    }
   
//*************************************Moon************************************
    public static void Moon ()
    {
	c.setColor(Color.black);
	c.fillRect(0,0,640,500);
	c.setColor(Color.yellow);
	c.fillOval(25,100,100,100);
	c.setColor(Color.black);
	c.fillOval(50,75,100,100);
	c.setColor(Color.yellow);
	c.fillStar(12,18,20,20);
	c.fillStar(76,19,20,20);
	c.fillStar(145,200,20,20);
	c.fillStar(200,13,20,20);
	c.fillStar(197,44,20,20);
	c.fillStar(327,308,20,20);
	c.fillStar(89,201,20,20);
	c.fillStar(120,352,20,20);
	c.fillStar(174,221,20,20);
	c.fillStar(139,297,20,20);
	c.fillStar(109,248,20,20);
	c.fillStar(48,149,20,20);
	c.fillStar(200,46,20,20);
    }
    
//************************************ColSquares*******************************
    public static void ColSquares ()
    {
	c.setColor(Color.blue);
	c.fillRect(0,0,400,400);
	c.setColor(Color.yellow);
	c.fillRect(50,50,300,300);
	c.setColor(Color.green);
	c.fillRect(100,100,200,200);
	c.setColor(Color.red);
	c.fillRect(150,150,100,100);
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
	    c.println ("Enter 1, 2, 3, 4, 5, 6");
	    c.println ("1 - Rectangle");
	    c.println ("2 - MyColors");
	    c.println ("3 - Circles");
	    c.println ("4 - House");
	    c.println ("5 - Moon");
	    c.println ("6 - ColSquares");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();

	    if (choice == 1)
	    {
		c.clear ();
		Rectangle();
	    }
	    else
		if (choice == 2)
		{
		    c.clear ();
		    MyColors();
		}
		else
		    if (choice == 3)
		    {
			c.clear ();
			Circles();
		    }
		    else
			if (choice == 4)
			{
			    c.clear();
			    House();
			}
			else
			    if (choice == 5)
			    {
				c.clear ();
				Moon();
			    }
			    else
				if (choice == 6)
				{
				    c.clear ();
				    ColSquares();
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


