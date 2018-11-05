package exercise.hiber;




import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    @Getter
    @Setter
    private int id;

    @Column(name="name", length=50, nullable = true)
    @Getter
    @Setter
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @Getter
    @Setter
    private List<User> users=new ArrayList<User>();

}
