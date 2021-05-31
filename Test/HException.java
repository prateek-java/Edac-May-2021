import java.util.*;


public class HException(){
public static void main(String args []){
Scanner sc = new Scanner(System.in);

itr [6] = {4,8,12,16,0};

System.out.println("Enter the first digit: ");
int i = sc.nextInt();
System.out.println("Enter the Second digit: ");
int j = sc.nextInt();
double res;
try{
res = itr[i]/itr[j];
System.out.println("Division: "+res);
} catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("Out of limit");
}
catch(ArithmeticException e) {
         System.out.println("Cannot divide by zero");
}
catch (NullPointerException e) {
 System.out.println("Null pointer exception occured");
}
}