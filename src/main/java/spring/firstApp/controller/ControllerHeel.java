package spring.firstApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.firstApp.model.Heel;
//import spring.firstApp.service.ServiceHeel;
import java.util.ArrayList;
import spring.firstApp.service.Service;
import spring.firstApp.service.ServiceHeel;

@CrossOrigin(origins = "*")
@RestController
public class ControllerHeel {
    @Autowired
private ServiceHeel serviceHeel;


    @RequestMapping("/heels")
    public ArrayList<Heel> getHeel(){

        return serviceHeel.getArrayHeel();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/heel")
    public void createHeelId(@RequestBody Heel heel){
        serviceHeel.createHeel(heel);
    }
}
