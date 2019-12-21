package RestAPI.repos;


import RestAPI.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User getUserByFirstName(String name);
    void deleteUserById(long id);
}
