package pojo;

public class LoginPage {

    private String email;
    private String password;
    //private String loginButtonId = "login"; // optional default value

    public LoginPage() {
        // No-arg constructor
    }

    public LoginPage(String email, String password) {
        this.email = email;
        this.password = password;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    
}

