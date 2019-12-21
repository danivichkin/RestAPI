package RestAPI.repos;

import RestAPI.models.Direction;
import org.springframework.data.repository.CrudRepository;

public interface DirectionsRepository extends CrudRepository<Direction, Long> {
    Direction getByTitle(String title);

}
