package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "wish_list")
public class WishList {

    private List<Direction> wishList;

    public WishList() {
    }

    public WishList(List<Direction> wishList) {
        this.wishList = wishList;
    }

    public List<Direction> getWishList() {
        return wishList;
    }

    public void setWishList(List<Direction> wishList) {
        this.wishList = wishList;
    }
}
