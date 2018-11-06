package pack3;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int digits[] = new int[]{1, 11, 88, 12, 12, 1, 120}; 
	    
	    System.out.println("Given Array: " + Arrays.toString(digits));
	   
	    	  
	    	  
	    	   int min = digits[0];
	    	   
	    	   
	    	   for(int i = 1 ; i < digits.length; i++)
			        if(digits[i] < min){
			            min = digits[i];
			        }
	    	   
	    	   System.out.println("Min value: " +  min);
	    	   
	    	   int sum = 0; 
	    	   int average = 0;
	    	   
	    	   for (int j = 0; j < digits.length; j++) {
	    	       sum+=digits[j];
	    	   
	    	   }
	    	       
	    	       average = sum / digits.length;
	    	       
	    			
	    			System.out.println("Average value of array elements is : " + average);
	    			{
	    				for (int k = digits.length - 1; k < digits.length; k--) {
	    					if (digits[k] == min) {
	    						digits[k] = average;
	    						break;
	    					}
	    				}
	    				System.out.println("Replaced the last min value" + Arrays.toString(digits));
	}
	}
}

		    
