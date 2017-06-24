package app.persistence;

import app.classes.Chore;
import app.classes.Expense;
import app.classes.Inmate;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by RJ on 2017-06-24.
 */
public class PersistenceOperations {

    /*
    Persistence methods (to be added soon)
     */

    //Get an inmate from database (as identified by ID)
    public Inmate retrieveInmate(Inmate inmate) {
        String id = inmate.getInmateId();
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        Inmate retrievedInmate = (Inmate) entityManager.createQuery(
                "from Inmate where inmateId = :inmateId").setParameter("inmateId", id).getSingleResult();
        entityManager.getTransaction().commit();
        return retrievedInmate;
    }

    //Get all inmate from database
    public List<Inmate> retrieveAllInmates() {
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        List<Inmate> retrievedInmates = (List<Inmate>) entityManager.createQuery("from Inmate").getResultList();
        entityManager.getTransaction().commit();
        return retrievedInmates;
    }

    //Add new user
    public void addInmate(Inmate inmate) {
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(inmate);
        entityManager.getTransaction().commit();
    }

    //Get all expenses from the database
    public List<Expense> retrieveAllExpenses() {
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        List<Expense> retrievedExpenses = (List<Expense>) entityManager.createQuery("from Expense").getResultList();
        entityManager.getTransaction().commit();
        return retrievedExpenses;
    }

    //Get all Inmate's expenses from database
    public List<Expense> retrieveInmatesExpenses(Inmate inmate) {
        String tempId = inmate.getInmateId();
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        List<Expense> inmatesExpenses = (List<Expense>) entityManager.createQuery(
                "from Expense where author.inmateId = :id").setParameter("id", tempId).getResultList();
        entityManager.getTransaction().commit();
        return inmatesExpenses;
    }

    //Add expense to database
    public void addExpense(Expense expense) {
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(expense);
        entityManager.getTransaction().commit();
    }

    //Get all chores from database
    public List<Chore> retrieveAllChores() {
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        List<Chore> retrievedChores = (List<Chore>) entityManager.createQuery("from Chore").getResultList();
        entityManager.getTransaction().commit();
        return retrievedChores;
    }

    //Get all chores of the given type from database
    public List<Chore> retrieveChoresByType(String targetType) {
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        List<Chore> retrievedChores = (List<Chore>) entityManager.createQuery(
                "from Chore where choreType = :t").setParameter("t", targetType).getResultList();
        entityManager.getTransaction().commit();
        return retrievedChores;
    }

    //Get all inmate's chores from database
    public List<Chore> retrieveChoresByInmate(Inmate inmate) {
        String inmId = inmate.getInmateId();
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        List<Chore> retrievedChores = (List<Chore>) entityManager.createQuery(
                "from Chore where due.inmateId = :i").setParameter("i", inmId).getResultList();
        entityManager.getTransaction().commit();
        return retrievedChores;
    }

    //Add chore to database
    public void addChore(Chore chore) {
        EntityManager entityManager = PersitenceUtils.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(chore);
        entityManager.getTransaction().commit();
    }
}
