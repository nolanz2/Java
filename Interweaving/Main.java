package Interweaving;

public class Main {

   public static boolean isInterleaved (String S, String X, String Y)  
    { 
        if (S.isEmpty()) {
        	return true;
        }
     if (S.charAt(0) == X.charAt(0)) {
    	 //recursive call using the remainder of s
    	 //relocate first character of X to the end of X to allow check of second position character while maintaining order to 
    	 	//allow for further calls. Ex: 101 -> 011 -> 110 - > 101. Original order re-appears once all characters have been checked
    	 if (isInterleaved(S.substring(1), (X.substring(1) + X.substring(0,1)), Y)){
    		 return true;
    	 }}
     if (S.charAt(0) == Y.charAt(0)) {
    	 //Similar to previous recursive call, only this time applying method to string Y (string that matched first character with 
    	 		//first character of S)
    	 if (isInterleaved(S.substring(1), X, (Y.substring(1) + Y.substring(0,1)))){
    		 return true;
     }}
        
      return false;  
    } 
    public static void main(String []args){ 
          
        String X = "101"; 
        String Y = "00";  
        String S = "100010101";  
        if (isInterleaved(S, X, Y) == true)  
            System.out.printf("%s is interleaved of %s and %s", S, X, Y);  
        else
            System.out.printf("%s is not interleaved of %s and %s", S, X, Y); 
    } 
} 

