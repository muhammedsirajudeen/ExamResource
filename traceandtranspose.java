import java.util.*;

public class traceandtranspose{
	public static void main(String[] args){
		int array[][]=new int[2][2];
		Scanner scanner=new Scanner(System.in);
		int i,j;
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.println("enter the element");
				array[i][j]=scanner.nextInt();
			}
		}
	System.out.println("trace");
	int trace=0;
	for(i=0;i<2;i++){
		trace+=array[i][i];
	}	
	System.out.println(trace);
	int transpose[][]=new int[2][2];
			for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				transpose[j][i]=array[i][j];			}
		}

			for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.print(transpose[i][j]);
			}
			System.out.println("");
		}
	}


}