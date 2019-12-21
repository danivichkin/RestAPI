package RestAPI.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "wish_list")
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<Direction> wishList;

    public WishList() {
    }

    public WishList(List<Direction> wishList) {
        this.wishList = wishList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Direction> getWishList() {
        return wishList;
    }

    public void setWishList(List<Direction> wishList) {
        this.wishList = wishList;
    }
}
