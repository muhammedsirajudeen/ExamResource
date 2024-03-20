import java.util.*;
import java.lang.Math;
public class armstrong{

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter lower limit");
		int lower=scanner.nextInt();
		System.out.println("enter upper limit");
		int upper=scanner.nextInt();
		
		for(int i=lower;i<upper;i++){
			int digits=Integer.toString(i).length();
			int j=i;
			int originalnum=i;
			int sum=0;
			while(j>0){
			
				int remainder=j%10;
				sum+=Math.pow(remainder,digits);
				j=j/10;

			}
			if(sum==originalnum){
				System.out.println(originalnum);
			}
		}
	}

}