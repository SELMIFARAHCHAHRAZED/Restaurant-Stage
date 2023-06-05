package RestaurantProject.spring.Reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import RestaurantProject.spring.Entities.Employer;

public interface EmployerRepository  extends CrudRepository<Employer, Integer>{
	Boolean existsByTelephonep(int telephonep);
	@Query(value=("select * from Employer u where u.job_Em like :cle"),nativeQuery = true)
    List<Employer> ListEmployer(@Param("cle") String nom);

}
