package services;


import models.User;
import models.WishList;
import org.springframework.stereotype.Service;
import repos.WishListRepository;

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

    public User save(WishList unit) {
        wishListRepository.save(unit);
        return null;
    }

}
