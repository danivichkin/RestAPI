package RestAPI.models;

import javax.persistence.*;

@Entity
@Table(name = "users")

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

    public User() { }

    public User(String firstName, WishList wishList) {
        this.firstName = firstName;
        this.wishList = wishList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public WishList getWishList() {
        return wishList;
    }

    public void setWishList(WishList wishList) {
        this.wishList = wishList;
    }
}
