package com.d2h.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D2HService {

	int currentBalance = 100;
	Scanner scanner = new Scanner(System.in);
	String pack = " ";
	int monthPack;
	int price = 0;
	int discount = 0;
	String serviceChannel = "";
	String channel = "";
	String[] channelArray= {};
	String channelList = "";

	protected int viewCurrentBalance() {

		System.out.println("Current balance is:Rs. " + currentBalance);
		return currentBalance;

	}

	protected int rechargeAccount() {
		System.out.println("Enter the amount to recharge:");
		int amount = scanner.nextInt();
		currentBalance = currentBalance + amount;
		System.out.println("Recharge completed successfully. Current balance is : Rs. " + currentBalance);
		return currentBalance;

	}

	protected void showPackChannelandService() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("|           View available packs, channels and services             |");
		System.out.println("|*******************************************************************|");
		System.out.println("|           Available packs for subscription                        |");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|  Silver pack: Zee, Sony, Star Plus: Rs 50.00                      |");
		System.out.println("|  Gold Pack: Zee, Sony, Star Plus, Discovery, NatGeo: Rs.100.00    |");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|  Available channels for subscription                              |");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|  Zee: 10 Rs.                                                      |");
		System.out.println("|  Sony: 15 Rs.                                                     |");
		System.out.println("|  Star Plus: 20 Rs.                                                |");
		System.out.println("|  Discovery: 10 Rs.                                                |");
		System.out.println("|  NatGeo: 20 Rs.                                                   |");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|  Available services for subscription                              |");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|  LearnEnglish Service: 200 Rs.                                    |");
		System.out.println("|  LearnCooking Service: 100 Rs.                                    |");
		System.out.println("---------------------------------------------------------------------");
	}

	protected int subscribeChannelPack() {

		System.out.println("Subscribe to channel packs");

		System.out.println("Enter the Pack you wish to subscribe: (Silver: ‘S’, Gold: ‘G’):");
		pack = scanner.next();

		if (pack.equalsIgnoreCase("S")) {
			price = 50;
			pack = "Silver";
		} else if (pack.equalsIgnoreCase("G")) {
			price = 100;
			pack = "Gold";
		}
		System.out.println("Enter the months:");
		monthPack = scanner.nextInt();

		System.out.println("You have successfully subscribed the following packs - " + pack);

		System.out.println("Monthly price: Rs " + price);
		System.out.println("No of months: " + monthPack);
		int subsAmount = price * monthPack;
		System.out.println("Subscription Amount: Rs " + subsAmount);
		if (monthPack >= 3) {
			discount = (subsAmount * 10) / 100;
		}
		System.out.println("Discount applied: Rs " + discount);

		int finalPrice = subsAmount - discount;

		System.out.println("Final Price after discount: Rs " + finalPrice);

		currentBalance = currentBalance - finalPrice;

		System.out.println("Account balance: Rs " + currentBalance);
		System.out.println("Email notification sent successfully");
		System.out.println("SMS notification sent successfully");
		return currentBalance;
	}

	protected void addChannel() {

		Map<String, Integer> channelist = new HashMap<String, Integer>();
		channelist.put("Zee", 10);
		channelist.put("Sony", 15);
		channelist.put("Star Plus", 20);
		channelist.put("Discovery", 10);
		channelist.put("NatGeo", 20);

		System.out.println("Add channels to existing subscription");

		System.out.println("Enter channel names to add (separated by commas): ");
		channel = scanner.next();
		channelArray = channel.split(",");
		for (String channelVal : channelArray) {
			int channelAmt = channelist.get(channelVal);
			currentBalance = currentBalance - channelAmt;
		}

		System.out.println("Channels added successfully.");

		System.out.println("Account balance: Rs " + currentBalance);
	}

	protected void addSpecialService() {
		System.out.println("Subscribe to special services");

		Map<String, Integer> serviceList = new HashMap<String, Integer>();
		serviceList.put("LearnEnglish", 200);
		serviceList.put("LearnCooking", 100);
		System.out.println("Enter the service name:");
		serviceChannel = scanner.next();
		int servChanAmt = serviceList.get(serviceChannel);
		currentBalance = currentBalance - servChanAmt;
		System.out.println("Service subscribed successfully");
		System.out.println("Account balance: Rs" + currentBalance);

		System.out.println("Email notification sent successfully");
		System.out.println("SMS notification sent successfully");
	}

	protected void viewSubscriptionDetails() {
		System.out.println("View current subscription details");
		int size = channelArray.length;
		for (int i = 0; i < size; i++) {
			channelList = channelList + "+" + channelArray[i];
		}

		System.out.println("Currently subscribed packs and channels:" + pack + channelList);
		System.out.println("Currently subscribed services:" + serviceChannel);
	}

	protected void updateNotificationService() {
		System.out.println("Update email and phone number for notifications");
		System.out.println("Enter the email:");
		String email = scanner.next();
		System.out.println("Enter phone:");
		String phoneNo = scanner.next();
		System.out.println("Email and Phone updated successfully");
	}

}
