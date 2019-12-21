package services;


import models.User;
import org.springframework.stereotype.Service;
import repos.UserRepository;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List getAll() {
        LinkedList linkedList = new LinkedList();
        userRepository.findAll().forEach(linkedList::add);
        return linkedList;
    }

    public User findById(long id) { return userRepository.findById(id).orElse(null); }

    public void delete(User unit) {
        userRepository.delete(unit);
    }

    public User save(User unit) {
       return userRepository.save(unit);

    }

    public User findByFirstName(String name) {
       return userRepository.getUserByFirstName(name);
    }

    public void delById(long id) {
        userRepository.delUserById(id);
    }
}
