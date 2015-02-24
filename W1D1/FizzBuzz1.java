public class FizzBuzzWhile {
public static void main(String[] args){
 int x = 0;
 while(x < 100){
	   x+=1;

 // System.out.println( x );  
  if  ((x % 15 == 0) ){
	  	  System.out.println( "FIZZBUZZ");
		  
	}  else if (x % 3 == 0){
	  System.out.println( "FIZZ");
  } else if  (x % 5 == 0){
	  	  System.out.println( "BUZZ");

  }
   else {
	  	  System.out.println( x );

  }
  
 }  

 }}