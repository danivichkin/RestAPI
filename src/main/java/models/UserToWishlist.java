package models;

import org.springframework.boot.context.event.SpringApplicationEvent;

import javax.persistence.*;

@Entity
@Table(name = "utw")
public class UserToWishlist {

    @Id
    @Column(name = "utw_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private WishList wishList;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "user_id_key"), nullable = false)
    private User user;

    public UserToWishlist(){}

    public UserToWishlist(WishList wishList, User user) {
        this.wishList = wishList;
        this.user = user;
    }

    public WishList getWishList() {
        return wishList;
    }

    public void setWishList(WishList wishList) {
        this.wishList = wishList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
