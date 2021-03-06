package RestAPI.services;


import RestAPI.models.Direction;
import RestAPI.repos.DirectionsRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DirectionService {

    private final DirectionsRepository directionsRepo;

    public DirectionService(DirectionsRepository directionsRepo) {
        this.directionsRepo = directionsRepo;
    }

    public Direction saveDirection(Direction dir) { return directionsRepo.save(dir); }

    public List<Direction> getAll() {2,
        LinkedList<Direction> directionLinkedList = new LinkedList<>();
        directionsRepo.
    ().forEach(directionLinkedList::add);
        return directionLinkedList;
    }

    public void deleteAllDirections() { directionsRepo.deleteAll();}

    public void delDirectionById(long id) { directionsRepo.deleteById(id);}

    public Direction getById(Long id) {
        return directionsRepo.findById(id).orElse(null);
    }

    public Direction getByTitle(String title) {return directionsRepo.getByTitle(title);}
}
