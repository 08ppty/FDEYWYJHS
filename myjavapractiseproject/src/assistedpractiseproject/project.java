package assistedpractiseproject;

import java.util.Scanner;

public class project {

	
		// TODO Auto-generated method stub
		static class  Rectanglee{
			
		 
			public static void main(String[] args) {	
				
				int l, b , area;
				System.out.println("enter values for sides");
				try (Scanner r = new Scanner (System.in)) {
					l = r.nextInt()	;
					b = r.nextInt();
					area= l*b ;
					System.out.println("area recatangle " +area);
					
				}
				

			      catch (ArithmeticException e) { 
			          /* This block will only execute if any Arithmetic exception 
			           * occurs in try block
			           */
			          System.out.println("We can’t divide any number by zero");
			       }
			       catch (Exception e) {
			     /* This is a generic Exception handler which means it can handle              
			     /* all the exceptions. This will execute if the exception is not
			           * handled by previous catch blocks.
			           */
			          System.out.println("Exception occurred");
				
			}
				finally
				  {
			System.out.println("finally block is always executed");
					  }  
				System.out.println("rest of the code...");  
		}}}
