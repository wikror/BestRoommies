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

    @Column(name = "EXPENSE_NAME")
    private String name;

    @ManyToOne(targetEntity = Inmate.class, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "AUTHOR")
    private Inmate author;

    @Column(name = "EXPENSE_DATE")
    private Date date;

    @Column(name = "EXPENSE_VALUE")
    private Float value;

}
