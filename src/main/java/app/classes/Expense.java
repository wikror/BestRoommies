package app.classes;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wikto on 23.06.2017.
 */
@Entity
@Table(name = "EXPENSE")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EXPENSE_ID", nullable = false)
    private Long id;

    @Column(name = "EXPENSE_NAME", nullable = false)
    private String name;

    @ManyToOne(targetEntity = Inmate.class, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "AUTHOR")
    private Inmate author;

    @Column(name = "EXPENSE_DATE")
    private Date date;

    @Column(name = "EXPENSE_VALUE")
    private Float value;


    /*Getter & Setter methods for the attributes
    (except the auto-generated Id)
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inmate getAuthor() {
        return author;
    }

    public void setAuthor(Inmate author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

}
