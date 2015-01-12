/******************************************************
** Program: LargestInt.java
** Author: Jen Anderson
** Date: 1/19/13
** Description: Prints out the min and max values 
**     of the java data types
******************************************************/

public class assignment1
{
		
		 public static void main(String[] args){
			 System.out.println(Short.MIN_VALUE);
		     System.out.println(Short.MAX_VALUE);
			 System.out.println(Integer.MIN_VALUE);
		     System.out.println(Integer.MAX_VALUE);
		     System.out.println(Long.MIN_VALUE);
		     System.out.println(Long.MAX_VALUE);
		    
		     System.out.print("\n");
		     
		     short myShortMin = Short.MIN_VALUE;
		     	System.out.println(myShortMin);
		     short myShortMax = Short.MAX_VALUE;
		    	System.out.println(myShortMax);
		     int myIntMin=Integer.MIN_VALUE;
		     	System.out.println(myIntMin);
		     int myIntMax=Integer.MAX_VALUE;
			     	System.out.println(myIntMax);
			 long myLongMin=Long.MIN_VALUE;
			     	System.out.println(myLongMin);
			 long myLongMax=Long.MAX_VALUE;
				     	System.out.println(myLongMax);
				     	
			System.out.print("\n");
				     	
			 myShortMax++;
			 System.out.println(myShortMax++);
			 
			 myIntMax++;
			 System.out.println(myIntMax++);
			 
			 myLongMax++;
			 System.out.println(myLongMax++);
				
		}
	}

