
public class Test {

	import java.io.*;
	
{
	    public static void main(String args[])
	    {
	        String Str = new String(23  +      45   -(   343   /   12  ));
	 
	        // Split above string in at-most two strings 
	        for (String val: Str.split("-", 1,"+",1,"/",1, "(",1 , ")",1)
	            System.out.println(val);
	 
	        System.out.println("");
	   
	        // Splits Str into all possible tokens
	        for (String val: Str.split("-"))
	            System.out.println(val);
	    }
	}
}
