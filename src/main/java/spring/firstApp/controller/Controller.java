package spring.firstApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.firstApp.model.Dress;
import spring.firstApp.model.Heel;
import spring.firstApp.service.Service;

import java.util.ArrayList;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping("/products")
    public ArrayList<Dress> getDress(){

        return service.getArrayDress();
    }

    @RequestMapping("/dress/{id}")
    public Optional<Dress> getDressId(@PathVariable int id){
        return service.getDress(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/dress/{id}")
    public void deleteDressId(@PathVariable int id){
        service.deleteDress(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/dress")
    public void createDressId(@RequestBody Dress dress){
        service.createDress(dress);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/dress/{id}")
    public void updateDressId(@RequestBody Dress dress, @PathVariable int id){
        service.updateDress(dress, id);
    }
}
