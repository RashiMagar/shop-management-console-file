package ShopManagement;
import java.io.IOException;
import java.util.Scanner;

import Product_Management.ProductManagement;
import UserManagement.UserManagement;
import UserManagement.UserOptions;


public class ApplicationMain {

		public static void main(String args[]) throws IOException {

			Scanner scanner = new Scanner (System.in);

		boolean canIKeepRunningTheProgram = true; 

		System.out.println("***** Welcome to __SHOP MANAGEMENT__*****");

		System.out.println("Enter The Login Name : ");
		String LoginName = scanner.nextLine();
		System.out.println("Enter The Password : ");
		String Password = scanner.nextLine();

		if(!UserManagement.validateUserandPassword(LoginName, Password))
		{
			System.out.println("Login Failed!!! Closed The Application!!!");
			return;
		}

		while (canIKeepRunningTheProgram == true) { 

			System.out.println("***>>> WELCOME TO SHOP MANAGEMENT <<<***");
			System.out.println("\n");
			System.out.println("What would you like to do ?");
			System.out.println("1.User Management");
			System.out.println("2.Product Management");
			System.out.println("3.Quit");

			int optionSelectedByUser = scanner.nextInt();

			if (optionSelectedByUser == 1) {
				UserManagement.userManagement();

			}else if (optionSelectedByUser == 2) {
				ProductManagement.productManagement();
			}else if (optionSelectedByUser == 3) {
				break;
			}
		}
		}
	}