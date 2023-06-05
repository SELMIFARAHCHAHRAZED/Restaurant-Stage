package RestaurantProject.spring.Reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import RestaurantProject.spring.Entities.Plat;


public interface PlatRepository extends CrudRepository<Plat, Integer> {
	Boolean existsByNomP(String nomP);

	@Query(value=("select * from Plat p where p.prixP < :maxPrixP "),nativeQuery = true)
    List<Plat> ListPlat(@Param("maxPrixP") float prixP);
	@Query(value=("select  * from Plat p where p.idP = :idP "),nativeQuery = true)
	List<Plat> ListPlat2(@Param("idP") int idP);
}