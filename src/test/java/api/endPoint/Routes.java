package api.endPoint;

public class Routes {
	
	/*
	https://qa.codefios.com/api/
	
	user/login
	account/create
	account/getAll
	account/getOne
	account/update
	account/deleteOne
	*/ 
	
	//Base URL
	public static String base_url ="https://qa.codefios.com/api/";
	
	//API model 
	
	public static String login_url=base_url+"user/login";
	
	public static String create_url=base_url+"account/create";
	
	public static String getAll_url=base_url+"account/getAll";
	
	public static String getOne_url=base_url+"account/getOne";
	
	public static String update_url=base_url+"account/update";
	
	public static String deleteOne_url=base_url+"account/deleteOne";
}
