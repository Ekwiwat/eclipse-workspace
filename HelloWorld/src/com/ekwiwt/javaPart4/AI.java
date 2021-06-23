package com.ekwiwt.javaPart4;

public class AI implements IWebsiteCreator {
	public String name;
	   public String language;
	   public AI(String nameInput, String languageInput) {
	       this.name = nameInput;
	       this.language = languageInput;
	   }
	   public void createWebsite(String template, String titleName) { 
		   System.out.println(language + " automated Setup template: " + template); 
		   System.out.println(language + " automated Set Title name: " + titleName);
	   }
	@Override
	public void creaeWebsite(String template, String titleName) {
		// TODO Auto-generated method stub
		
	}

}
