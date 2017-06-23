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

    public Chore(){}

    public Chore(Inmate inmate, Date date) {
    }
}
