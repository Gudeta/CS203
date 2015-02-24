/* Write a program that prints all the numbers from 1 through 100 to the screen. If the number is a
multiple of 3 print the word FIZZ instead of the number. If the number is a multiple of 5 print the word
BUZZ instead of the number. If the number is a multiple of both 3 and 5 print FIZZ BUZZ instead of the
number

*/
public class FizzBuzz {
public static void main(String[] args){
 int x = 0;
 while(x < 100){
	   x+=1;

 // System.out.println( x );  
  if (x % 3 == 0){
	  System.out.println( "FIZZ");
  }
  if (x % 5 == 0){
	  	  System.out.println( "BUZZ");

  }
  else if  ((x % 3 == 0) & (x % 5 == 0)){
	  	  System.out.println( "FIZZBUZZ");
  }
  else {
	  	  System.out.println( x);

  }
  
 }  
  // System.out.println( "x is over 100");  

 }}