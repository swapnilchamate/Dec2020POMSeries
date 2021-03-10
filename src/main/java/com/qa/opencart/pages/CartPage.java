package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class CartPage {
	
	private By cartButton = By.id("cart");
	
	public CartPage() {
		System.out.println("car page const....");
	}
	
	public void clickOnCart() {
		System.out.println("click on cart " + cartButton);
	}
	

}
