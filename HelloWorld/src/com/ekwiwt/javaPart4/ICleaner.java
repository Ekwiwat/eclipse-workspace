package com.ekwiwt.javaPart4;

public interface ICleaner {
	public void setTools(String toolname);
	public void clean(String building, String roomName);
	public String[] getCleanedRoom();

}
