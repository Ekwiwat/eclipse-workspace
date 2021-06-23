package com.ekwiwt.javaPart4;

public interface IWindowsInstaller {
	public void formatWindows(String drive);
	public void installWindows(String version, String productKey);
	public int getLastInstalledWindowsVersion();

}
