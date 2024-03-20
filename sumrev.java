import java.util.*;
public class sumrev{

	public static void findvalue(int number){
		int sum=0;
		int reverse=0;
		while(number>0){
			int remainder=number%10;
			sum+=remainder;
			reverse=remainder+reverse*10;
			number=number/10;

		}
		System.out.println("sum"+sum);
		System.out.println("reverse"+reverse);
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		sumrev.findvalue(number);
		
	

	}

}