package com.techment.modal;

import java.util.List;

public class Restaurant {
	String restaurantName;
	IHotDrink hotDrink;
	ISoftDrink softDrink;
	List<String> employeeName;
	
	
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	

	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}



	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}

	public void setEmployeeName(List<String> employeeName) {
		this.employeeName = employeeName;
	}


	public void displayRestaurantDetails()
	{
		System.out.println("list of employee"+ employeeName);
		System.out.println("Restaurant Name: "+restaurantName);
		hotDrink.drink();
		softDrink.drink();
	}
}
