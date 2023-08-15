package spring.firstApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.firstApp.model.Heel;
import spring.firstApp.repository.RepositoryHeel;

import java.util.ArrayList;
@org.springframework.stereotype.Service
public class ServiceHeel {
    @Autowired
    private RepositoryHeel repositoryHeel;

    public ArrayList<Heel> getArrayHeel (){
        ArrayList<Heel> arrayHeel = new ArrayList<>();
        repositoryHeel.findAll().forEach(heel -> {
            arrayHeel.add(heel);
        });
        return arrayHeel;
    };

    public void createHeel(Heel heel){
        repositoryHeel.save(heel);
    }
}
