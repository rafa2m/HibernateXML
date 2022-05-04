package ejemplo.hibernate.xml;
/**
 * Clase para entidad de datos mapeada desde configuración XML
 * @author rafa
 * @version 1.0
 */
public class User {
	private int id;
	
	private String userName;
	
	private String userMessage;
	
	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	
	
}
