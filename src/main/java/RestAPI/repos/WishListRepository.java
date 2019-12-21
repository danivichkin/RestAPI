package RestAPI.repos;


import RestAPI.models.WishList;
import org.springframework.data.repository.CrudRepository;

public interface WishListRepository extends CrudRepository<WishList, Long> {
}
