package RestAPI.controllers;


import RestAPI.models.WishList;
import RestAPI.services.WishListService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/wishList")
public class WishListController {

    private final WishListService wishListService;

    public WishListController(WishListService directionService) {
        this.wishListService = directionService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getWishList")
    public List getAllWishLists(){
        return wishListService.getAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delWishLists(WishList wishList){
        wishListService.delete(wishList);
    }
}
