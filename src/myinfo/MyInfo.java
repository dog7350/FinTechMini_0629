package myinfo;

import member.*;

public class MyInfo {
	private static MyInfo instance = null;
	private MyInfo() {}
	public static MyInfo getInstance() {
		if (instance == null) instance = new MyInfo();
		return instance;
	}
	
	private static String Id = null, Pw, Name, Address, Age;
	private static boolean Admin;
	public static String getId() { return Id; }
	public static String getPw() { return Pw; }
	public static String getName() { return Name; }
	public static String getAddress() { return Address; }
	public static String getAge() { return Age; }
	public static boolean getAdmin() { return Admin; }
	
	public static void setMyInfo(UserInfo user) {
		Id = user.getId();
		Pw = user.getPw();
		Name = user.getName();
		Address = user.getAddress();
		Age = user.getAge();
		Admin = user.getAdmin();
	}
	
	public static void deleteMyInfo() {
		Id = null;
		Pw = null;
		Name = null;
		Address = null;
		Age = null;
		Admin = false;
	}
}
