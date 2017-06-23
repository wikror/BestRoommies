package app.classes;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by RJ on 2017-06-23.
 */
@Entity
@Table(name = "CHORE")
public class Chore {

    @Id
    @Column(name = "CHORE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long choreId;

    @ManyToOne(targetEntity = Inmate.class, cascade = CascadeType.ALL, optional = false)
    @Column(name = "DUE")
    private Inmate due;

    @Column(name = "CHORE_DATE")
    private Date date;

    @Column(name = "CHORE_NAME")
    private String name;


    /* Constructors */
    public Chore(){
        due = new Inmate("id", "");
        date = new Date();
        name = "Empty chore";
    }

    public Chore(Inmate inmate, Date date) {
    }


    /*Getter & Setter methods for the attributes
    (except the auto-generated Id)
     */

    public Inmate getDue() {
        return due;
    }

    public void setDue(Inmate due) {
        this.due = due;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
