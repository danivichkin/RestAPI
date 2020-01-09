package RestAPI.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "users")
@ToString(of = {"id", "firstname"})
@EqualsAndHashCode(of = {"id"})
@Data
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "surName")
    private String secondName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


    @OneToOne
    private WishList wishList;

    public User() {
    }

    public User(String firstName, WishList wishList) {
        this.firstName = firstName;
        this.wishList = wishList;
    }
}
