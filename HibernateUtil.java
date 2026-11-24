
package in.jsp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {

    // Creates a single EntityManagerFactory instance
    // using the persistence unit configured in persistence.xml
  
    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("crudPU");

    // Returns the existing EntityManagerFactory instance
  
    public static EntityManagerFactory getEmf() {
        return emf;
    }

    // Creates and returns a new EntityManager instance
    // for performing database operations (CRUD)
  
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
