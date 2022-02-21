import java.util.*;

class Ex1
{
	public static int getSecondSmallest(int arr[])
	{
	//Get the second smallest element in the array 

		int temp = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return arr[1];
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int arr [] = new int[n];
		
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}

		int res = getSecondSmallest(arr);

		System.out.println("Second smallest interger is :"+res);
	}
}