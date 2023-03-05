package carrentalservicepublisher;

import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish{

	Scanner input = new Scanner(System.in);
	String [] locations = {"Galle", "Kandy", "Colombo", "Jaffna"};
	int [][] distance = {{0, 220, 120, 500}, {220, 0, 120, 320}, {120, 120, 0, 360}, {500, 320, 360, 0}};
	String [] vehicles = {"Car", "Van", "Bike", "Tuk-Tuk"};
	
	@Override
	public String publishService() {
		return "Execute the publish service";
	}

	@Override
	public void clientDetails() {
		System.out.println("\n---------Welcome to Car Rental Service---------\n");
		
		System.out.print("Enter your name: ");
		String userName = input.next();
		System.out.println("\nHello " + userName + "\n");
		locations();
	}

	public void locations() {
		System.out.println("Select your Location");
		for(int i = 0; i < locations.length; i++) {
			System.out.println(i+1 + " " + locations[i]);
		}
		System.out.print("\nLocation: ");
		int location = input.nextInt();
		destination(location);
	}

	public void destination(int boradingLocation) {
		System.out.println("\nSelect your Destination");
		int count = 1;
		for(int i = 0; i < locations.length; i++) {
			if(boradingLocation != i+1) {
				System.out.println(count++ + " " + locations[i]);
			}
		}
		System.out.print("\nDestination: ");
		int location = input.nextInt();

		if(location >= boradingLocation) {
			location++;
		}

		System.out.print("\nFrom: " + locations[boradingLocation - 1] + " To: " + locations[location -1]);
		int dis = distance[boradingLocation - 1][location -1];
		System.out.println("\nDistance: " + dis);
		vehicles(dis);
	}
	
	public void vehicles(int dis) {
		System.out.println("\nSelect your vehicle");
		for(int i = 0; i < vehicles.length; i++) {
			System.out.println(i+1 + " " + vehicles[i]);
		}
		int fare = 0;
		System.out.print("\nVehicle: ");
		int fareVehicle = input.nextInt();
		
		System.out.print("\nNo of stops: ");
		int stops = input.nextInt();
		
		switch(fareVehicle) {
			case 1:
				fare = dis * 50;
				break;
			case 2:
				fare = dis * 100;
				break;
			case 3:
				fare = dis * 20;
				break;
			case 4:
				fare = dis * 30;
		}
		System.out.println("\nFare: Rs " + fare * stops);
		boolean conf = true;
		while(conf) {
			System.out.println("\nDo you want to continue? (Y/N)");
			String confirm = input.next();
			if(confirm.equalsIgnoreCase("Y")) {
				locations();
				conf = false;
			}else if(confirm.equalsIgnoreCase("N")) {
				conf = false;
				System.out.println("osgi>");
			}
		}
		
	}

}
