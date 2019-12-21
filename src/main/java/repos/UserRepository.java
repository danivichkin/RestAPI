package repos;


import models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User getUserByFirstName(String name);
    void delUserById(long id);
}
