package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Link;

@Repository 
public interface LinkRepo extends JpaRepository<Link, Integer>{

}
