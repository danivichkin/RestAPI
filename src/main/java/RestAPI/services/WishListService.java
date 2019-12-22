package RestAPI.services;

import RestAPI.models.WishList;
import RestAPI.repos.WishListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService{
    private final WishListRepository wishListRepository;

    public WishListService(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    public List getAll() {
        return (List) wishListRepository.findAll();
    }

    public WishList findById(long id) {
        return wishListRepository.findById(id).orElse(null);
    }

    public void delete(WishList unit) {
        wishListRepository.delete(unit);
    }

    public void save(WishList unit) {
        wishListRepository.save(unit);
    }

}
