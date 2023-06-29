package member;

public class UserInfo {
	private String Id, Pw, Name, Address, Age;
	private boolean Admin;

	public String getId() { return Id; }
	public void setId(String id) { Id = id; }

	public String getPw() { return Pw; }
	public void setPw(String pw) { Pw = pw; }

	public String getName() { return Name; }
	public void setName(String name) { Name = name; }

	public String getAddress() { return Address; }
	public void setAddress(String address) { Address = address; }

	public String getAge() { return Age; }
	public void setAge(String age) { Age = age; }

	public boolean getAdmin() { return Admin; }
	public void setAdmin(boolean admin) { Admin = admin; }
}
