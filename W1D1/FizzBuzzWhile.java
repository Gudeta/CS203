public class FizzBuzzWhile {
public static void main(String[] args){
 int x = 0;      
 //declare an integer named 'x' and give it value 0
 while(x < 100){
	 //keep looping as long as x is less than 100
	   x+=1;
	   //increment by one

  if  ((x % 15 == 0) ){
	  //check if x is multiple of 15
	  	  System.out.println( "FIZZBUZZ");
		  
	}  else if (x % 3 == 0){
		//check if x is only multiple of 3.
	  System.out.println( "FIZZ");
  } else if  (x % 5 == 0){
	  //check if x is only multiple of 5
	  	  System.out.println( "BUZZ");

  }
   else {
	  	  System.out.println( x );

  }
  
 }  

 }}