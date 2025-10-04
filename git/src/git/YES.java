package git;

import java.util.Scanner;

public class YES {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter the number of elements: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	       
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	       
	        int max = arr[0];

	       
	        for (int i = 1; i < size; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        
	        System.out.println("The largest element is: " + max);

	       
	    }
	
	


	}


