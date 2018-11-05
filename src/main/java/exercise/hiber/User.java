package exercise.hiber;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

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


}
