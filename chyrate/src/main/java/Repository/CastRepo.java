package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Cast;

@Repository
public interface CastRepo extends JpaRepository<Cast, Integer> {

}
