package RestaurantProject.spring.Reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import RestaurantProject.spring.Entities.Reclam;





public interface ReclamRepository  extends  CrudRepository<Reclam, Integer>{
	@Query(value=("select * from Reclam  r where r.type_Rec like :cle"),nativeQuery = true)
    List<Reclam> ListReclam(@Param("cle") String nom);
}
