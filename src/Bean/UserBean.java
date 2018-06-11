package Bean;

public class UserBean {
	private int userId;
	private String password;
	private String name;
	private String protrait;
	private String sex;
	
	private String phoneNumber;
	private String email;
	private String address;
	private String collection;
	private String history;
	public UserBean(int userId, String password, String name, String protrait, String sex, String phoneNumber,
			String email, String address, String collection, String history) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.protrait = protrait;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.collection = collection;
		this.history = history;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProtrait() {
		return protrait;
	}
	public void setProtrait(String protrait) {
		this.protrait = protrait;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	
	

}
