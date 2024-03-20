import java.util.*;
public class complex{
	int real;
	int imaginary;
	static complex add(complex c1,complex c2){
		complex result=new complex();
		result.real=c1.real+c2.real;
		result.imaginary=c1.imaginary+c2.imaginary;
		return result;
	}
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first complex number");
		complex c1=new complex();
		c1.real=scanner.nextInt();
		c1.imaginary=scanner.nextInt();
		System.out.println("enter second complex number");
		complex c2=new complex();
		c2.real=scanner.nextInt();
		c2.imaginary=scanner.nextInt();
		complex result=complex.add(c1,c2);
		System.out.println("new complex number"+result.real+" "+result.imaginary);

	}


}