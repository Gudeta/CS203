public class FizzBuzzFor {
public static void main(String[] args){
 for(int x = 1; x <= 100; x+=1)
	 //for loop statement initialization, check if x less or equal 100 and x value increment by one
      {
       if  ((x % 15 == 0) )
		   //check if x is multiple of both 3 and 5 or 15. 
		{
	  	  System.out.println( "FIZZBUZZ");
		}
		else if (x % 3 == 0)
			//check if x is multiple of 3.
		{
	       System.out.println( "FIZZ");
        } 
		else if  (x % 5 == 0)
			check if x is multiple of 5. 
		{
	  	  System.out.println( "BUZZ");

        }
      else 
		  //or print the x.
        {
	  	  System.out.println( x );
		}
  
    } 
   }
 }