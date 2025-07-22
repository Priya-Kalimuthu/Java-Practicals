package junit;

public class login {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	boolean checklogin() {
		if (username.equals("admin") && password.equals("admin123")) {
			return true;
		} else {
			return false;

		}
	}

}
