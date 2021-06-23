package com.ekwiwt.javaPart4;

public class Programmer extends Employee implements IWebsiteCreator, IWindowsInstaller {
	

public Programmer(String firstnameInput, String lastnameInput, int salaryInput) { 
	super(firstnameInput, lastnameInput, salaryInput);
}
public void FixPC(String serialNumber) {
System.out.println("I'm trying to fix PC serialNumber:" + serialNumber); 
}
public void createWebsite(String template, String titleName) { 
	System.out.println("Setup template: " + template); 
	System.out.println("Set Title name: " + titleName);
}
@Override
public void formatWindows(String drive) {
	// TODO Auto-generated method stub
	
}
@Override
public void installWindows(String version, String productKey) {
	// TODO Auto-generated method stub
	
}
@Override
public int getLastInstalledWindowsVersion() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public void creaeWebsite(String template, String titleName) {
	// TODO Auto-generated method stub
	
}
}