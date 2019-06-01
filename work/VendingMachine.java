package vendingmachine;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine 

{
		static String laptops;
		static String Mobiles;
		
		static int laptopPrice = 80;
		static int mobilePrice = 100;
		
		static ArrayList<Integer> dollar;
		{
			dollar = new ArrayList<Integer>();
			dollar.add(5);
			dollar.add(10);
			dollar.add(20);
			dollar.add(50);
			dollar.add(100);
		}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0 ;
		System.out.println("\n\nPlease enter your selection:"
				+ "\n1. Laptops \t "
				+ "\n2. Mobiles\t ");
		choice = keyboard.nextInt(); 
		switch(choice)
		{
		case 1:

			System.out.println("\n\nSelect your Choice:"
					+ "\n1. Dell \t "
					+ "\n2. Lenovo \t ");

			choice = keyboard.nextInt();
			if (choice == 1)
			{
				System.out.println("\n\n Product Details:"
						+ "\n ProductName \t" + "Price \t" 
						+ "\n Dell \t "	+"\t"+ laptopPrice +"$");
				System.out.println("Insert the cash:" );
			choice = keyboard.nextInt();
			
			

			}
			else if (choice == 2){
				{
					System.out.println("\n\n Product Details:"
							+ "\n ProductName \t" + "Price \t" 
							+ "\n Lenovo \t "+"\t"+ laptopPrice +"$");
				}
			}
			break;
		case 2:

			System.out.println("\n\nSelect your Choice:"
					+ "\n1. Iphone \t "
					+ "\n2. Samsung \t ");

			choice = keyboard.nextInt();
			if (choice == 1)
			{
				System.out.println("\n\n Product Details:"
						+ "\n ProductName \t" + "Price \t"
						+ "\n Iphone \t "+"\t" + mobilePrice +"$");
				break;
			}
			else if (choice == 2){
				{
					System.out.println("\n\n Product Details:"
							+ "\n ProductName \t" + "Price \t"
							+ "\n Samsung \t "+"\t"+ mobilePrice +"$");
				}
			}
			break;	
		}
	}
	}
