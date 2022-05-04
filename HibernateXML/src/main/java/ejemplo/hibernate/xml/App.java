package ejemplo.hibernate.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Ejemplo de mapeo de entidades usando XML
 * @author Rafa
 * @version 1.0
 */
public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().
    			configure().build();
    	SessionFactory sf = new MetadataSources(sr).buildMetadata()
    			.buildSessionFactory();
    	
    	//apertura de la sesión
    	Session session = sf.openSession();
    	
    	User user = new User();
    	user.setId(1);
    	user.setUserName("Rafa");
    	user.setUserMessage("Hola mundo desde Rafa");
    	
    	User user2 = new User();
    	user2.setId(2);
    	user2.setUserName("Alejandro");
    	user2.setUserMessage("Hola mundo desde Alejandro");
    	
    	//se inicia la transacción para crear los nuevos objetos en la bbdd
    	session.getTransaction().begin();
    	//se guardan los objetos en la transacción abierta
    	session.save(user);
    	session.save(user2);
    	//se envían los objetos guardados en la transacción a la bbdd
    	session.getTransaction().commit();
    	
    	session.close();
    	sf.close();
    }
}
