package spring.firstApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.firstApp.model.Heel;

public interface RepositoryHeel extends JpaRepository<Heel, Integer> {
}
