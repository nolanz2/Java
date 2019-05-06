package Interweaving;

import java.util.Scanner;

public class Main {
	//counter for comparisons of S with string X
	static int M = 0;
	
	//counter for comparisons of S with string Y
	static int N = 0;
	
	//Function to check interleaving of two strings X and Y within string S
	//Allows cases where string S is simply a repetition of only one String X or Y
   public static boolean isInterleaved (String S, String X, String Y)  
    { 
        if (S.isEmpty()) {
        	return true;
        }
     if (S.charAt(0) == X.charAt(0)) {
    	 M++;
    	 //recursive call using the remainder of s
    	 //relocate first character of X to the end of X to allow check of second position character while maintaining order to 
    	 	//allow for further calls. Ex: 101 -> 011 -> 110 - > 101. Original order re-appears once all characters have been checked
    	 if (isInterleaved(S.substring(1), (X.substring(1) + X.substring(0,1)), Y)){
    		 return true;
    	 }}
     if (S.charAt(0) == Y.charAt(0)) {
    	 N++;
    	 //Similar to previous recursive call, only this time applying method to string Y (string that matched first character with 
    	 		//first character of S)
    	 if (isInterleaved(S.substring(1), X, (Y.substring(1) + Y.substring(0,1)))){
    		 return true;
     }}
        
      return false;  
    } 
    public static void main(String []args){ 
    	//user input to determine values for String S X Y
    	//assumes length of S is larger than both X and Y
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Enter value of string X: ");
    	String X = keyboard.nextLine();
    	System.out.println("Enter value of string Y: ");
    	String Y = keyboard.nextLine();
    	System.out.println("Enter value of string S: ");
    	String S = keyboard.nextLine();
    	if (S.length() < X.length() || S.length() < X.length()) {
    		System.out.println("Please enter a value for S that is longer than X and Y: ");
    		S = keyboard.nextLine();
    	}
    	keyboard.close();
    	
    	//Switch to hard code X Y S values
    	//String X = "1010"; 
        //String Y = "000";  
        //String S = "101101A";  
    	
    	//run operation to check for interleaving
        if (isInterleaved(S, X, Y) == true)  
            System.out.printf("%s is interleaved of %s and %s", S, X, Y);  
        else
            System.out.printf("%s is not interleaved of %s and %s", S, X, Y); 
        System.out.println();
        
        //output total count of comparisons 
        System.out.println("Comparisons made: " + (M + N));
    } 
} 

