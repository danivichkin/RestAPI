package RestAPI.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "wish_list")
@Data
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
}

