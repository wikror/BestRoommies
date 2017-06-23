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

    @OneToMany(targetEntity = Expense.class, mappedBy = "author", cascade = CascadeType.ALL)
    private List<Expense> expenses = Lists.newArrayList();

    @OneToMany(targetEntity = Chore.class, mappedBy = "inmate", cascade = CascadeType.ALL)
    private List<Chore> chores = Lists.newArrayList();

}
