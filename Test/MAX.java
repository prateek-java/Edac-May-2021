import java.util.*;
class MAX
{
public static void main(String args[])
{Scanner sc = new Scanner(System.in);
//System.out.println("Enter the digits: ");
int n1 = 5;//sc.nextINT();
int n2 = 6;//sc.nextINT();
int n3 = 7;//sc.nextINT();
int max;
    max = (n1 > n2)?(n1 > n3 ? n1 : n3):(n2 > n3 ? n2 : n3);
   
    System.out.println("Largest number: "+max);
                                 
                            
}
}