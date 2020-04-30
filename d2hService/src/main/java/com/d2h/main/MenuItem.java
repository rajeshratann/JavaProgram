package com.d2h.main;

import java.util.Scanner;

import com.d2h.service.D2HService;

public class MenuItem extends D2HService{
	
	protected int inputValueOption(int inputOption) {
		int account =0;
		switch(inputOption) {
	
		case 1:
			account=viewCurrentBalance();
			break;
		case 2:
			account=rechargeAccount();
			break;
		case 3:
			showPackChannelandService();
			break;
		case 4:
			account = subscribeChannelPack();
			break;
		case 5:
			 addChannel();
			break;
		case 6:
			 addSpecialService();
			break;
		case 7:
			 viewSubscriptionDetails();
			break;
		case 8:
			updateNotificationService();
			break;
		default:
			System.out.println("Thanks for Choosing SatTV Serivice.");
			break;
		}
		return account;
	}
	
	public static void main(String[] args) {
		MenuItem menuItem = new MenuItem();
		Scanner scanner = new Scanner(System.in);
		int inputValue = 0;
		
		System.out.println("************Welcome to SatTV*****************");
		System.out.println("1. View current balance in the account");
		System.out.println("2. Recharge Account");
		System.out.println("3. View available packs, channels and services");
		System.out.println("4. Subscribe to base packs");
		System.out.println("5. Add channels to an existing subscription");
		System.out.println("6. Subscribe to special services");
		System.out.println("7. View current subscription details");
		System.out.println("8. Update email and phone number for notifications");
		System.out.println("9. Exit");
		
        while (inputValue!=9) {
            System.out.print("Enter the option: ");
            inputValue = scanner.nextInt();
            menuItem.inputValueOption(inputValue);
            System.out.println("========================================================");
        }
	}

}
