package controllers;


import models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.UserServices;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getUser")
    public List getAllUsers(){
        return userServices.getAll();
    }

    @RequestMapping(method = RequestMethod.GET)
    public User getUserById(@RequestParam long id){
        return userServices.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public User getUserByFirstName(@RequestParam String name){
       return userServices.findByFirstName(name);
    }
    @RequestMapping(method = RequestMethod.DELETE, path = "/delUser")
    public void delUser(User user){
        userServices.delete(user);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public void delUserById(@RequestParam long id){
        userServices.delById(id);
    }
    @RequestMapping(method = RequestMethod.POST, path = "/addUser")
    public User addUser(){
        return userServices.save(new User());
    }

    //TODO PUT zapros
}
