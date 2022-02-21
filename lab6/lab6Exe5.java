
import java.util.Scanner;

public class Lab6Exe5 {
    public static int getSecondSmallest(Integer[] arr)
      {
    	
    	List<Integer> al=Arrays.asList(arr); // array to list
    	Collections.sort(al);
    	int smallest= al.get(1);
    	return smallest;
    	  
      }

    public static void main(String[] args) {



    Integer[] arr= {10,46,5,88};
    int smallest=getSecondSmallest(arr);
    System.out.println("Second Smallest element:"+smallest);
    }
	}