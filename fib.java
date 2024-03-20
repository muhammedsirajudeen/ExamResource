import java.util.*;
public class fib{

public static void main(String[] args){
	
Scanner scanner=new Scanner(System.in);
System.out.println("enter the limit");
int limit=scanner.nextInt();
int fib1=0;
int fib2=1;
int fib,i;
System.out.println(fib1);
System.out.println(fib2);
for(i=0;i<limit;i++)
{
	fib=fib1+fib2;
	System.out.println(fib);
	fib1=fib2;
	fib2=fib;
}
}

}