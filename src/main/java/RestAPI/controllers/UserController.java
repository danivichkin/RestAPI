package RestAPI.controllers;


import RestAPI.models.User;
import RestAPI.models.WishList;
import org.springframework.web.bind.annotation.*;
import RestAPI.services.UserServices;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List getAllUsers(){
        return userServices.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getItemById(@PathVariable int id) { return userServices.findById(id); }

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(@RequestBody String firstname, @RequestBody WishList wishList){
        User user = new User(firstname, wishList);
        return userServices.save(user);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id){ userServices.delById(id); }

}
