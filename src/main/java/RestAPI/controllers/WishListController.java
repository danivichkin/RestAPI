package RestAPI.controllers;


import RestAPI.models.WishList;
import RestAPI.services.WishListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlists")
public class WishListController {

    private final WishListService wishListService;

    public WishListController(WishListService directionService) {
        this.wishListService = directionService;
    }

    @GetMapping
    public List getAllWishLists(){
        return wishListService.getAll();
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public void editWishList(@RequestParam WishList wishList){
        wishListService.save(wishList);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delWishListsById(@RequestParam int id){
        WishList  wishList = wishListService.findById(id);
        wishListService.delete(wishList);
    }
}
