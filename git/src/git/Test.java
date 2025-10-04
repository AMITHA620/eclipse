package git;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter the number of elements: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];
	        int sum = 0;

	       
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }

	       
	        double average = (double) sum / size;

	       
	        System.out.println("Sum of array elements: " + sum);
	        System.out.println("Average of array elements: " + average);

	       
	    }
	

}




