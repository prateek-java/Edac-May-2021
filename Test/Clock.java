import java.util.*;

interface clock
{
   double dis_time_sec();
	double dis_time_hrs();
}

class Time implements clock{
Scanner sc = new Scanner(System.in);
double min;

public void Accept_min(){
System.out.println("Enter the minute value: ");
 min = sc.nextDouble();
}
@override
void dis_time_sec(){
double sec;
sec= min*60;
System.out.println("Time in seconds: "+sec);
}
@override
void dis_time_hrs(){
double hrs;
hrs = min*120;
System.out.println("TIME IN HOURS: "+hrs);
}
}

public class Clock
{
	public static void main(String[] args);
	Time t1 = new Time();
	t1.Accept_min();
	t1.dis_time_sec();
	t1.dis_time_hrs();
}