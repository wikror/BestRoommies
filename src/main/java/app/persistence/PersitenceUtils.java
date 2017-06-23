package app.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;

/**
 * Created by RJ on 2017-06-23.
 */
public class PersitenceUtils {

    //The app's entity manager
    protected static EntityManager entityManager;

    //SessionFactory creation, for PersistenceUtils' internal use only
    protected static SessionFactory buildSessionFactory() {
        SessionFactory sf = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sf;
    }

    //Access to the entity manager for external xlasses
    public synchronized static EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = buildSessionFactory().createEntityManager();
        }
        return entityManager;
    }

}
