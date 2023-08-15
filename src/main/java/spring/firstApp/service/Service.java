package spring.firstApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.firstApp.model.Dress;
import spring.firstApp.model.Heel;
import spring.firstApp.repository.Repository;
import spring.firstApp.repository.RepositoryHeel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    @Autowired
    private RepositoryHeel repositoryHeel;
//    static private ArrayList<Dress> arrayDress = new ArrayList<>(Arrays.asList(
//            new Dress(1, "Tee-shirt", 19.99, 6),
//            new Dress(2, "Pull", 29.99, 8)
//    ));

    public ArrayList<Dress> getArrayDress (){
        ArrayList<Dress> arrayDress = new ArrayList<>();
        repository.findAll().forEach(dress -> {
            arrayDress.add(dress);
        });
        return arrayDress;
    };

    public Optional<Dress> getDress(int id){
         return repository.findById(id);
    }

    public void deleteDress(int id){
        repository.deleteById(id);
    }

    public void createDress(Dress dress){
        repository.save(dress);
    }

    public void updateDress(Dress dress, int id){
        repository.save(dress);
    }

}
