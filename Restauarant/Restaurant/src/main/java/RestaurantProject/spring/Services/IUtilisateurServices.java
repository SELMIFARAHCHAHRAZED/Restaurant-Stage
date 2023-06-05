package RestaurantProject.spring.Services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import RestaurantProject.spring.Entities.Utilisateur;

public interface IUtilisateurServices {
 
	public Utilisateur addU(Utilisateur u);
	public List<Utilisateur>addlisteUser(List<Utilisateur>lu);
    public String addUserTestEmail(Utilisateur u);
    public Utilisateur updateUser(Utilisateur u , Integer  idU);
    public void deleteUser(Integer idU);
    public List <Utilisateur> getAllUser();
    public List <Utilisateur> getUserByNom(String ch);
  //  public Utilisateur getBYEmail(String login,String pwd);
    
}