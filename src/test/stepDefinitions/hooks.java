package stepDefinitions;

import java.io.IOException;

public class hooks {
	
	public void beforeScenario() throws IOException
	{		//execute this code only when place id is null
		//write a code that will give you place id
		
		APISteps m =new APISteps();
		if(APISteps.userID==null)
		{
			m.user_calls_with_http_request("createUser", "POST");
		}
	}
}
