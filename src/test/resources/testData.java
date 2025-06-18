package utilsResouces;

import main.pojo.LoginPage;

public class testData {
	//we pass the data in here for create user(using POST) instead of passing it in stepDefinition.java
	
	public LoginPage createUserPayLoad(String email, String pass) {
		//CreateUser user = new CreateUser();
		pojo.LoginPage user = new LoginPage();
		
		user.setEmail("eve.holt@reqres.in");
		user.setPassword("cityslicka");
		
		return user;
	}
}
