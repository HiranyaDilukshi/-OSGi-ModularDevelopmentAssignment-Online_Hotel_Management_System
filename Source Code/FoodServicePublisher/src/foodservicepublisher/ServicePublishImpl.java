package foodservicepublisher;

import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish{

	Scanner input = new Scanner(System.in);
	
	String [] meals = {"Breakfast", "Lunch", "Dinner"};
	String [] mealOptions = {"Package 1", "Package 2", "Package 3"};
	int [][] mealPrice = {{400, 500, 600}, {20, 10, 30}};
	String [] drinks = {"Water", "Tea", "Soda", "Fruit Juice"};
	
	public String publishService() {
		return "Execute the publish service";
	}
	
	public void roomDetails(){
		
		System.out.println("Select the Meal:");
			
		for(int i = 0; i < meals.length; i++) {
			System.out.println(i+1 + " " + meals[i]);
		}
			
		System.out.print("\nSelected Meal is ");
		int meal = input.nextInt();
		
		System.out.println("Select the Meal Option:");
		
		for(int i = 0; i < mealOptions.length; i++) {
			System.out.println(i+1 + " " + mealOptions[i]);
		}
			
		System.out.print("\nSelected Meal Option is ");
		int mealOption = input.nextInt();
		
		int mealPrice = 0;
		
		switch(mealOption){
			case 1:
				mealPrice = 400;
				break;
			case 2:
				mealPrice = 500;
				break;
			case 3:
				mealPrice = 600;
		}
		
		System.out.print("Select the Drink: ");
		
		for(int i = 0; i < drinks.length; i++) {
			System.out.println(i+1 + " " + drinks[i]);
		}
			
		System.out.print("\nSelected Drink is ");
		int drink = input.nextInt();
		
		switch(drink){
			case 1:
				mealPrice = mealPrice + 0;
				break;
			case 2:
				mealPrice = mealPrice + 50;
				break;
			case 3:
				mealPrice = mealPrice + 150;
				break;
			case 4:
				mealPrice = mealPrice + 200;
		}
		
		System.out.print("Total Price: " + mealPrice);
			
		
	}


}
