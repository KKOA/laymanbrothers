package domain;
	
	
	
	public class User {
	
	
	private String firstName;
	
	
	private String lastName;
	
	
	private String email;
	
	
	private String username;
	
	
	public User( String firstName, String lastName, String email, String username) {
	
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.email = email;
		
		this.username = username;
		
	}
	
	public User() {
		
	}
	
	public String getFirstName() {
	
		return firstName;
	
	}
	
	
	
	public String getLastName() {
	
		return lastName;
	
	}
	
	
	
	public String getEmail() {
	
		return email;
	
	}
	
	
	
	public String getUsername() {
	
		return username;
	
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}


