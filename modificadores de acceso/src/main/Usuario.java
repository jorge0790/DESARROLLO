package main;

public class Usuario {

	
	private String username;
	private  String password;
	
	//Constructor
  public Usuario(String username, String password) {
	 this.username=username;
	 this.password=password;
	 
  }
	
	
	
	
	 void saluda() {
		 System.out.println("username es "+this.username);
	 }
	 
	 //getter
	 public String getPassword() {
		 return this.password;
	 }
	 
	 //setter
	 public void setPassword(String password) { this.password=password; }
	 
	 public String getUsername() {
		 return this.username;
	 }
	 
	 
	 
}
