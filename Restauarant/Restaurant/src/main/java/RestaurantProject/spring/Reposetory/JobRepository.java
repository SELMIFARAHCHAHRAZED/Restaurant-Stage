package RestaurantProject.spring.Reposetory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import RestaurantProject.spring.Entities.Job;

public interface JobRepository extends CrudRepository<Job, Integer> {
	Boolean existsByNomjob(String NomJob);
	List<Job> findByNomjob(String nomjob);
}
