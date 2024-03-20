import java.util.*;
public class base{

	public static void main(String[] args){
		char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		System.out.println("enter the base");
		int base=scanner.nextInt();
		String str="";
		while(number>0){
			int remainder=number%base;	
			str=dig[remainder]+str;
			number=number/base;
		}
		System.out.println(str);
		
	}
}