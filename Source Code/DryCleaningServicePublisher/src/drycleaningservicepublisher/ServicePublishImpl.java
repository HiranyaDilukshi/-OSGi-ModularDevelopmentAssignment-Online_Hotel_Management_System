package drycleaningservicepublisher;

import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish{

	Scanner input = new Scanner(System.in);
	String [] services = {"Immediate Service", "One-day Service", "Normal Service"};
	
	@Override
	public String publishService() {
		return "Execute the publish service";
	}

	@Override
	public void clientDetails() {
		System.out.println("---------Welcome to Dry Cleaning Service---------\n");
		System.out.print("Enter your name: ");
		String userName = input.next();
		System.out.println("\nHello " + userName + "\n");
		
		System.out.print("Enter your room number: ");
		String roomNo = input.next();
		System.out.println("\nYour room number: " + roomNo);
		weights();
	}

	public void weights() {
		System.out.println("\nEnter your laundry weight: ");
		int laundryWeight = input.nextInt();
		System.out.print("\nLaundry weight: " + laundryWeight);
		services(laundryWeight);
	}

	public void services(int laundryWeight) {
		System.out.println("Select the service type: ");
		for(int i = 0; i < services.length; i++) {
			System.out.println(i+1 + " " + services[i]);
		}
		System.out.print("\nService Type: ");
		int service = input.nextInt();
		
		int fare = 0;
		
		switch(service) {
			case 1:
				fare = 1000;
				break;
			case 2:
				fare = 500;
				break;
			case 3:
				fare = 250;
		}
		
		System.out.println("Total pay: Rs. " + fare * laundryWeight + ".00");
		
		boolean conf = true;
		while(conf) {
			System.out.println("\nDo you want to continue? (Y/N)");
			String confirm = input.next();
			if(confirm.equalsIgnoreCase("Y")) {
				weights();
				conf = false;
			}else if(confirm.equalsIgnoreCase("N")) {
				conf = false;
			}
		}
	}
	
	

}
