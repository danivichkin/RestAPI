package repos;

import models.Direction;
import org.springframework.data.repository.CrudRepository;

public interface DirectionsRepo extends CrudRepository<Direction, Long> {
    Direction getByTitle(String title);

}
