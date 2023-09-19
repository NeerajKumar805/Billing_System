package com.neeraj.billingSystem;

import java.util.Scanner;

public class All_In_One_Store {
	static Scanner sc = new Scanner(System.in);

	static int i = 1, count;
	static double totalPrice, numOfKg; // By default static variables initialize with 0 and there will create only one
										// copy in entire program
	static String[] proName = new String[100]; // Just Declared 100 items size...
	static double[] qty = new double[100];
	static double[] proPrice = new double[100];

	static void menu() {
		int choice = 0;
		do {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\t 1. FRUITS \t\t\t\t|");
			System.out.println("|\t\t\t 2. VEGETABLES \t\t\t\t|");
			System.out.println("|\t\t\t 3. COSMETICS \t\t\t\t|");
			System.out.println("|\t\t\t 4. MASALA POWDERS \t\t\t|");
			System.out.println("|\t\t\t 5. EXIT \t\t\t\t|");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Please choose your option");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				fruit();
				break;
			case 2:
				vegetable();
				break;
			case 3:
				cosmetic();
				break;
			case 4:
				masala_powder();
				break;
			case 5:
				billing();
				break;
			default:
				System.out.println("Please choose valid option :");
			}
		} while (choice != 5);
	}

	static void fruit() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t 101. MANGO----------------1KG--------------RS.200\t|");
		System.out.println("|\t 102. APPLE----------------1KG--------------RS.250\t|");
		System.out.println("|\t 103. BANANA---------------1KG--------------RS.50\t|");
		System.out.println("|\t 104. PINEAPPLE------------1KG--------------RS.70\t|");
		System.out.println("|\t 105. PAPAYA---------------1KG--------------RS.60\t|");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Please choose your PRODUCT CODE :");
		int pro_code = sc.nextInt();

		switch (pro_code) {
		case 101:
			productInfo("Mango", 200);
			break;
		case 102:
			productInfo("Apple", 250);
			break;
		case 103:
			productInfo("Banana", 50);
			break;
		case 104:
			productInfo("PineA..", 70);
			break;
		case 105:
			productInfo("Papaya", 60);
			break;
		default:
			System.out.println("Please choose valid product code!!!");
			fruit();
		}
	}

	static void vegetable() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t 201. POTATO----------------1KG--------------RS.20\t|");
		System.out.println("|\t 202. BRINGLE---------------1KG--------------RS.25\t|");
		System.out.println("|\t 203. TOMATO----------------1KG--------------RS.50\t|");
		System.out.println("|\t 204. L.FINGER--------------1KG--------------RS.35\t|");
		System.out.println("|\t 205. CARROT----------------1KG--------------RS.30\t|");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Please choose your PRODUCT CODE :");
		int pro_code = sc.nextInt();

		switch (pro_code) {
		case 201:
			productInfo("Potato", 20);
			break;
		case 202:
			productInfo("Bringle", 25);
			break;
		case 203:
			productInfo("Tamato", 25);
			break;
		case 204:
			productInfo("LadyF..", 35);
			break;
		case 205:
			productInfo("Carrot", 30);
			break;
		default:
			System.out.println("Please choose valid product code!!!");
			vegetable();
		}
	}

	static void cosmetic() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t 301. KAJAL----------------1p---------------RS.100\t|");
		System.out.println("|\t 302. LIP-STICK------------1p---------------RS.150\t|");
		System.out.println("|\t 303. FACE-CREAM-----------1p---------------RS.250\t|");
		System.out.println("|\t 304. LOTION---------------1p---------------RS.170\t|");
		System.out.println("|\t 305. NAIL-POLISH----------1p---------------RS.60\t|");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Please choose your PRODUCT CODE :");
		int pro_code = sc.nextInt();

		switch (pro_code) {
		case 301:
			productInfo("Kajal", 100);
			break;
		case 302:
			productInfo("LipsT", 150);
			break;
		case 303:
			productInfo("FaceC..", 250);
			break;
		case 304:
			productInfo("Lotion", 170);
			break;
		case 305:
			productInfo("NailP..", 60);
			break;
		default:
			System.out.println("Please choose valid product code!!!");
			cosmetic();
		}
	}

	static void masala_powder() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t 401. CHILLI--------------1KG--------------RS.220\t|");
		System.out.println("|\t 402. TURMERIC------------1KG--------------RS.180\t|");
		System.out.println("|\t 403. CORIANDAR-----------1KG--------------RS.150\t|");
		System.out.println("|\t 404. CUMIN(JEERA)--------1KG--------------RS.300\t|");
		System.out.println("|\t 405. MEAT-MASALA---------1KG--------------RS.600\t|");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Please choose your PRODUCT CODE :");
		int pro_code = sc.nextInt();
		switch (pro_code) {
		case 401:
			productInfo("Chili..", 220);
			break;
		case 402:
			productInfo("Turme..", 180);
			break;
		case 403:
			productInfo("Coria..", 150);
			break;
		case 404:
			productInfo("Cumin..", 300);
			break;
		case 405:
			productInfo("MeatM..", 600);
			break;
		default:
			System.out.println("Please choose valid product code!!!");
			masala_powder();
		}
	}

	static boolean shopAgainOrNot() {
		System.out.println("Do you want to purchase anything else?");
		System.out.println("Press 1 for continue :");
		System.out.println("Press any button(0-9) for exit :");
		int ch = sc.nextInt();
		if (ch == 1)
			return true;
		else
			return false;
	}

	static void productInfo(String NameOfPro, int PriceOfPro) {
		System.out.println("Enter the quantity : ");
		numOfKg = sc.nextDouble();
		proName[i] = NameOfPro;
		qty[i] = numOfKg;
		proPrice[i] = PriceOfPro * numOfKg;
		totalPrice += PriceOfPro * numOfKg;
		count++;
		i++;
		if (shopAgainOrNot())
			menu();
		else
			billing();
	}

	static void billing() {
		int dis = 0; // For discount
		if (count == 0) // Here cheaking, whether customer has purchased any product or not
			System.out.println("Thanks for visting, Please visit again!!!");
		else {
			System.out.println("Please Enter your Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter your Address : ");
			String Address = sc.nextLine();
			System.out.println("Enter your Contact no. : ");
			long mobileNo = sc.nextLong();
			System.out.println(
					"-----------------------------------------Welcome to the Neeraj's All in one store------------------------------------------");
			System.out.println("Customer Name : " + name);
			System.out.println("Customer Addres : " + Address);
			System.out.println("Customer Mobile : " + mobileNo);
			System.out.println("----------------------------------------");
			System.out.println("S.no |   Qty  | Name \t    |\tPrice");
			System.out.println("----------------------------------------");
			for (int i = 1; i <= count; i++) {
				System.out.println("  " + i + "\t 1" + qty[i] + "\t" + proName[i] + "\t\t" + proPrice[i]);
			}
			System.out.println("----------------------------------------");
			System.out.println("Total bill is :\t\t\t" + totalPrice);
			if (totalPrice >= 1000) { // Customer gets discount of 5%, if total price is greater or equal to 1000
				dis = (int) (totalPrice / 100) * 5;
				System.out.println("1 offer applied (5% discount)");
			}
			System.out.println("Discount is :  \t\t\t-" + dis);
			System.out.println("----------------------------------------");
			System.out.println("Total payable amount \t\t" + (totalPrice - dis));
			System.out.println("----------------------------------------");
			if (dis > 0)
				System.out.println("Yay, You saved " + dis + " Rupees!!!");
			System.out.println("\nThanks for shopping with us, Please visit again!!!");
		}
		System.out.println(
				"\n===========================================================================================================================");
		System.out.println(
				".................................................. CREATED BY NEERAJ KUMAR .................................................");
		System.out.println(
				"===========================================================================================================================");
		System.out.println("[Program terminated]");
		System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println(
				"---------------------------------------------Welcome to the ALL IN ONE STORE---------------------------------------------");
		menu();
	}
}