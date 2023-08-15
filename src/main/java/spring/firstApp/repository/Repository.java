package spring.firstApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import spring.firstApp.model.Dress;

public interface Repository extends JpaRepository<Dress, Integer> {

}
