
public class Sum {
	import java.lang.*;
	import java.util.*;
	import java.text.*;



	    public static void menu() {
	        System.out.print(" Select one of the option below\n" +
	                "   1 -     Enter a new number\n " +
	                "   2 - Show the sum of the last two number\n" +
	                "   3 - Show the current number as pluses\n" +
	                "   4 - Show the current number as centred pluses\n");
	    }

	    public static void main(String[] args) {
	        int no = 0;
	        int sum = 0;
	        int option;

	        Scanner input = new Scanner(System.in);

	        do {
	            menu();
	            option = input.nextInt();
	            switch (option) {
	                case 1:
	                    System.out.print("Please enter a number between 0 and 20 : ");
	                    no = input.nextInt();
	                    break;
	                case 2:
	                    sum += no;
	                    System.out.println("The Sum of the Numbers is : " + sum);
	                default:
	                    System.out.print("Invalid option");
	            }
	        } while (option != 5);
	    }
	
