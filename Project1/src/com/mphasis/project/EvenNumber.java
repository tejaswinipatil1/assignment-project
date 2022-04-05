package com.mphasis.project;

public class EvenNumber {

	public static void main(String[] args) {
		private static Scanner sc;
		public static void main(String[] args) 
		{
			int number, i;
			sc = new Scanner(System.in);
			
			System.out.print(" Please Enter any Number : ");
			number = sc.nextInt();	
			
			for(i = 2; i <= number; i = i + 2)
			{
				System.out.print(i +"\t"); 
			}	
		}
	

	}

}
