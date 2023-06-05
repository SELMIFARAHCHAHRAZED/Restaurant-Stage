package RestaurantProject.spring.Reposetory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import RestaurantProject.spring.Entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    
	//Boolean existsByEmail(String email);
	@Query(value=("select * from Utilisateur u where u.login like :cle"),nativeQuery = true)
    List<Utilisateur> ListUsers(@Param("cle") String login);
	/*@Query(value=("select * from Utilisateur u where u.login  like :cle and u.pwd   like :cle2"),nativeQuery = true)
    List<Utilisateur> login(@Param("cle") String login ,@Param("cle2")String pwd);*/
	Optional<Utilisateur> findByLogin(String login);
	Optional<Utilisateur> findByIdU(Integer idU);
}
