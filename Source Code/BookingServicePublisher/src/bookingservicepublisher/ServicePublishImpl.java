package bookingservicepublisher;

import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish{

	Scanner input = new Scanner(System.in);
	String [] locations = {"Galle", "Kandy", "Colombo", "Jaffna"};
	int [][] distance = {{0, 220, 120, 500}, {220, 0, 120, 320}, {120, 120, 0, 360}, {500, 320, 360, 0}};
	String [] roomTypes = {"Single Bed", "Double Bed", "Triple Bed", "Squad Bed"};
	
	@Override
	public String publishService() {
		return "Execute the publish service";
	}

	@Override
	public void clientDetails() {
		System.out.println("---------Welcome to Booking Service---------\n");
		System.out.print("Enter your name: ");
		String userName = input.next();
		System.out.println("\nHello " + userName + "\n");
		hotels();
	}

	public void hotels() {
		System.out.println("Select your hotel location");
		for(int i = 0; i < locations.length; i++) {
			System.out.println(i+1 + " " + locations[i]);
		}
		System.out.print("\nSelected hotel location: ");
		int location = input.nextInt();
		room(location);
	}

	public void room(int boradingLocation) {
		System.out.println("\nSelect your room type");
		int count = 1;
		for(int i = 0; i < roomTypes.length; i++) {
			System.out.println(count++ + " " + roomTypes[i]);
			
		}
		
		System.out.print("\nSelected room type: ");
		int roomType = input.nextInt();
		int roomFare = 0;
		
		switch(roomType) {
		case 1:
			roomFare = 10000;
			break;
		case 2:
			roomFare = 20000;
			break;
		case 3:
			roomFare = 30000;
			break;
		case 4: 
			roomFare = 40000;
		}
		
		System.out.print("\nYour room fare for 1 night: " + roomFare + "\n");
		days(roomFare);
		
	}
	
	public void days(int roomFare) {
		System.out.println("\nNumber of days:");
		int days = input.nextInt();
		
		System.out.println("\nTotal amount: Rs " + days * roomFare);
		boolean conf = true;
		while(conf) {
			System.out.println("\nDo you want to continue? (Y/N)");
			String confirm = input.next();
			if(confirm.equalsIgnoreCase("Y")) {
				hotels();
				conf = false;
			}else if(confirm.equalsIgnoreCase("N")) {
				conf = false;
				System.out.println("\nosgi> \n");
				System.out.println("\n");
			}
		}
		
	}

}
