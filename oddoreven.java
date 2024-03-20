import java.util.*;
public class oddoreven{


	public static void main(String[] args){
		Even even=new Even();
		Odd odd=new Odd();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=scanner.nextInt();
		even.limit=limit;
		odd.limit=limit;
		even.run();
		odd.run();



	}
}
class Even implements Runnable{
	int limit;
	@Override
	public void run(){
		for(int i=1;i<limit;i++){
			if(i%2==0){
				System.out.println("even"+i);
			}
		}
	}

}

class Odd implements Runnable{

	int limit;
	public void run(){
		for(int i=1;i<limit;i++){
			if(i%2!=0){
				System.out.println("odd"+i);
			}
		}
	}

}

