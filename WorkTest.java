/*    1)WAP to demonstrate (2.45pm to 3.30)
a)class, object
b)array of object
c)different method
d)constructor
e)constructor /method overloading
f)static variable, method
  */
 // import java.util.*;
  class Shop
 {
  
  String CoustmerName;
  int Id;
  String ProPurchase;
  
  Shop(String name, int id, String Purchase)
  {
	CoustmerName=name;
	Id=id;
	ProPurchase=Purchase;
  
  }
  public void display()  
	{  
		System.out.println("CoustmerName: "+CoustmerName + "  " + " Id: "+Id+ " " +"ProPurchase: "+ProPurchase);
		
	}
 }
	class WorkTest  
	{ public static void main(String[] args)
	{//Scanner sc = new Scanner(System.in);
		Shop[] c = new Shop[5];
	
		c[0] = new Shop("Hemant", 1, "shampoo");
		c[1] = new Shop("zen", 12, "Detergent");
		c[2] = new Shop("Himani", 3," Nirma");
		c[3] = new Shop("Ramson", 32, "Surf");
		c[4] = new Shop("Densi", 35, "boomer");
	
	for(int i=0;i<c.length;i++)
	{
	
		c[i].display();
	}

	
	}
	}
	
  