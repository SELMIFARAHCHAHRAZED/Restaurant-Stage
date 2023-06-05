package RestaurantProject.spring.Reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import RestaurantProject.spring.Entities.Commande;


public interface CommandeRepository extends CrudRepository<Commande, Integer> {
	@Query(value=("select * from Commande c where c.etatC like :cle"),nativeQuery = true)
    List<Commande> ListCommande(@Param("cle") String nom);
	/*@Query(value=("select * from Plat p  inner join Commande c on c.plat_idp=p.idP where p.idP  =:idP "),nativeQuery = true)
    List<Commande> ListCommandePrix(@Param("idP") Integer idP);*/
}
