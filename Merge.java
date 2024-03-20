import java.util.*;
class Merge{

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);

		int array[]=new int[3];
		for(int i=0;i<3;i++){
			System.out.println("enter the element of first array");
			array[i]=scanner.nextInt();				
		
}
		int secondarray[]=new int[3];
		for(int i=0;i<3;i++){
			System.out.println("enter the element of second array");
			secondarray[i]=scanner.nextInt();				
		}
		int n=array.length+secondarray.length;
		int mergedarray[]=new int[n];
		for(int i=0;i<array.length;i++){
			mergedarray[i]=array[i];
		}
		for(int i=0;i<secondarray.length;i++){
			mergedarray[i+array.length]=secondarray[i];
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(mergedarray[j]>mergedarray[j+1]){
					int temp=mergedarray[j];
					mergedarray[j]=mergedarray[j+1];
					mergedarray[j+1]=temp;
				}
		}
		}
		System.out.println("after sorting");

		for(int i=0;i<n;i++){
			System.out.println(mergedarray[i]);
		}		
	

		
}

}