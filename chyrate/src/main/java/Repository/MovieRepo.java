package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer>{

}
