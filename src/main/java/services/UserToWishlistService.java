package services;

import models.UserToWishlist;
import org.springframework.stereotype.Service;
import repos.UserToWishlistRepository;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserToWishlistService {

    private final UserToWishlistRepository userToWishlistRepository;

    public UserToWishlistService(UserToWishlistRepository userToWishlistRepository) {
        this.userToWishlistRepository = userToWishlistRepository;
    }

    public List<models.UserToWishlist> getAll(){
        Iterator<UserToWishlist> all = userToWishlistRepository.findAll().iterator();
        LinkedList<UserToWishlist> linkedList = new LinkedList<>();
        while (all.hasNext()){
            linkedList.add(all.next());
        }
        return linkedList;
    }

    public UserToWishlist findById(int id){
        return userToWishlistRepository.findById(id).orElse(null);
    }

    public void delete(UserToWishlist userToWishlist){
        userToWishlistRepository.delete(userToWishlist);
    }

    public void save(UserToWishlist userToWishlist){
        userToWishlistRepository.save(userToWishlist);
    }
}
