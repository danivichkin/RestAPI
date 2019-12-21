package controllers;


import models.Direction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.DirectionService;
import java.util.List;

@RestController
@RequestMapping("/direction")
public class DirectionController {

    private final DirectionService directionService;

    public DirectionController(DirectionService directionService) {
        this.directionService = directionService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getDirection")
    public List<Direction> getAllDir() {
        return directionService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET)
    public Direction getById(@RequestParam Long id) {
        return directionService.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Direction getByTitle(@RequestParam String title){ return directionService.getByTitle(title); }

    @RequestMapping(method = RequestMethod.DELETE, path = "/delDirection")
    public void delDirection(){ directionService.delAllDirections();}

    @RequestMapping(method = RequestMethod.DELETE)
    public void delDirectionById(@RequestParam long id) { directionService.delDirectionById(id); }

    @RequestMapping(method = RequestMethod.POST, path = "/addDirection")
    public Direction addDirection() { return directionService.saveDirection(new Direction());}

    //TODO PUT Zapros

}