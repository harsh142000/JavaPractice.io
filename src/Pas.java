/*package whatever //do not write package name here */
//write a java code for a function that takes an input 
//and checks whether it follows the following criteria for a valid password:
//1. at least 4 characters.
//2. at least one numeric value.
//3.at least one capital letter.
//4. must not have space or slash(/)
//5. must not start with a number.


import java.io.*;
import java.util.Scanner;

public class Pas {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Input: ");
	    //taking input.
		String input=sc.nextLine();
		
		//passCheck is a boolean method which returns true or false.
		System.out.println(passCheck(input));
		
	}
	
	public static boolean passCheck(String input){
	    //converting string to character array.
	    char[] ch=input.toCharArray();
	    
	    //checking for the first element whether it is a digit or not, and also other constraints.
	    //if it is then false is returned from here itself.
	    
	    
	    if(Character.isDigit(ch[0]) || Character.isWhitespace(ch[0]) || ch[0]=='/' )
	        return false;
	   
	   //taking counts for characters, digits and uppercase characters.
	  int countchar=1;
	  int countnum=0;
	   int countCap=0;
	   
	   if(Character.isUpperCase(ch[0]))
	   countCap++;
	   
	   //from second element to last element checking other restrictions for a valid password.
	   for(int i=1;i<ch.length;i++)
	   {
	       countchar++;
	       if(Character.isWhitespace(ch[i]) || ch[i]=='/'){
	           return false;
	       }
	       
	       if(Character.isDigit(ch[i]))
	       countnum++;
	       
	       if(Character.isUpperCase(ch[i]))
	       countCap++;
	   }
	   //after checking and counting returning final value: true or false.
	   if(countchar>=4 && countnum>=1 && countCap>=1)
	   return true;
	   
	   else
	   return false;
	}
}