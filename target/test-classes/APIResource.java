package utilsResouces;
//enum is special class in java which has collection of constants or  methods
public enum APIResource {
	
	createUser("/users"),
	logInUser("/login"),
	deleteUser("/users");
	
	private String path;
	
	APIResource(String resource)
	{
		this.path=resource;
	}
	
	public String getResource()
	{
		return path;
	}
	

}
