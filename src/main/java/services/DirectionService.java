package services;


import models.Direction;
import repos.DirectionsRepo;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DirectionService {

    private final DirectionsRepo directionsRepo;

    public DirectionService(DirectionsRepo directionsRepo) {
        this.directionsRepo = directionsRepo;
    }

    public Direction saveDirection(Direction dir) { return directionsRepo.save(dir); }

    public List<Direction> getAll() {
        LinkedList<Direction> directionLinkedList = new LinkedList<>();
        directionsRepo.findAll().forEach(directionLinkedList::add);
        return directionLinkedList;
    }

    public void delAllDirections() { directionsRepo.deleteAll();}

    public void delDirectionById(long id) { directionsRepo.deleteById(id);}

    public Direction getById(Long id) {
        return directionsRepo.findById(id).orElse(null);
    }

    public Direction getByTitle(String title) {return directionsRepo.getByTitle(title);}
}
