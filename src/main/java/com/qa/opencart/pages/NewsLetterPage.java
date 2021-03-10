package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class NewsLetterPage {
	
	private By letter = By.id("letter");
	
	public NewsLetterPage() {
		System.out.println("car page const....");
	}
	
	public void clickOnLetter() {
		System.out.println("click on letter " + letter);
	}
	

}
