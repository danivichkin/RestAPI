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

    @GetMapping
    public List<Direction> getAllDir() {
        return directionService.getAll();
    }

    @GetMapping("{id}")
    public Direction getById(@RequestParam Long id) { return directionService.getById(id); }

    @DeleteMapping
    public void deleteDirectionById(@RequestBody int id) { directionService.delDirectionById(id); }

    @PutMapping
    public void editDirection(@RequestBody Direction direction){ directionService.saveDirection(direction); }

    @PostMapping
    public Direction addDirection(@RequestParam String title,
                                  @RequestParam String description) {
        Direction direction = new Direction(title, description);
        return directionService.saveDirection(direction);
    }
}