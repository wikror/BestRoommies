package app.classes;

import com.google.common.collect.Lists;

import javax.persistence.*;
import java.util.List;

/**
 * Created by wikto on 23.06.2017.
 */
@Entity
@Table(name = "INMATE")
public class Inmate {

    @Id
    @Column(name = "INMATE_ID", nullable = false)
    private String inmateId;

    @Column(name = "INMATE_PASSWORD")
    private String password;


    public Inmate(String id, String s) {
        inmateId = id;
        password = s;
    }
    @OneToMany(targetEntity = Expense.class, mappedBy = "author", cascade = CascadeType.ALL)
    private List<Expense> expenses = Lists.newArrayList();

    @OneToMany(targetEntity = Chore.class, mappedBy = "due", cascade = CascadeType.ALL)
    private List<Chore> chores = Lists.newArrayList();


    /*Getter & Setter methods for the attributes
     */

    public String getInmateId() {
        return inmateId;
    }

    public void setInmateId(String inmateId) {
        this.inmateId = inmateId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<Chore> getChores() {
        return chores;
    }

    public void setChores(List<Chore> chores) {
        this.chores = chores;
    }

}
