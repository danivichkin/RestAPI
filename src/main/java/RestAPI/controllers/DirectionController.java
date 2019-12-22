package RestAPI.controllers;


import RestAPI.models.Direction;
import org.springframework.web.bind.annotation.*;
import RestAPI.services.DirectionService;
import java.util.List;

@RestController
@RequestMapping("/direction")
public class DirectionController {

    private final DirectionService directionService;

    public DirectionController(DirectionService directionService) {
        this.directionService = directionService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Direction> getAllDir() {
        return directionService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Direction getById(@RequestParam Long id) { return directionService.getById(id); }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void delDirectionById(@RequestBody int id) { directionService.delDirectionById(id); }

    @RequestMapping(method = RequestMethod.PUT)
    public void editDirection(@RequestBody Direction direction){ directionService.saveDirection(direction); }

    @RequestMapping(method = RequestMethod.POST)
    public Direction addDirection(@RequestParam String title, @RequestParam String description) {
        Direction direction = new Direction(title, description);
        return directionService.saveDirection(direction);
    }
}