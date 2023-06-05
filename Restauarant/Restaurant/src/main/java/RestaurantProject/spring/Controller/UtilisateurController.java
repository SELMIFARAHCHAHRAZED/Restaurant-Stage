package RestaurantProject.spring.Controller;

import java.util.List;

//import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import RestaurantProject.spring.exception.ResourceNotFoundException;
import RestaurantProject.spring.Entities.Job;
import RestaurantProject.spring.Entities.Utilisateur;
import RestaurantProject.spring.Reposetory.UtilisateurRepository;
import RestaurantProject.spring.Services.UtilisateurServices;

@RestController
@CrossOrigin(origins  = "http://localhost:4200",maxAge = 3600)
public class UtilisateurController {
	
	
	@Autowired
	UtilisateurServices ur; 
	UtilisateurRepository urep; 
	/* @GetMapping("/login")
	   
	public Utilisateur findemailpwd( @RequestBody Utilisateur u) {
		
		return ur.getBYEmail(u.getLogin(), u.getPwd());
	}*/
   @PostMapping("/adduser")
   
	public Utilisateur addU( @RequestBody Utilisateur u) {
		  return ur.addU(u);
	}
   @PostMapping("/addListuser")
   public List<Utilisateur> addlisteUser( @RequestBody List<Utilisateur> lu){
	return ur.addlisteUser(lu);
	      
}
   @PostMapping("/adduserwithtestEmail")
   public String addUserTestEmail( @RequestBody Utilisateur u) {
	return ur.addUserTestEmail(u);
	   
   }
   @PostMapping("/updateuser/{idU}")
   public Utilisateur updateUser(@RequestBody Utilisateur u,  @PathVariable("idU") Integer idU) {
	return ur.updateUser(u, idU);
	   
   }
   @DeleteMapping("/deleteuser")
   public void deleteUser(@Param("idU") Integer  idU) {
	   ur.deleteUser(idU);
   }
   @GetMapping("/gettallusers")
   public List<Utilisateur> getAllUser(){
	return ur.getAllUser();
   }
  
   @GetMapping("/getuserbylogin/{ch}")
   public List<Utilisateur> getUserByNom( @PathVariable String ch ){
	   return ur.getUserByNom(ch);
   }
   
   
   
   
   
   
   @GetMapping("/users/{idU}")
	public ResponseEntity<Utilisateur> getUtilisateurById(@PathVariable(value = "idU")Integer idU)
			throws ResourceNotFoundException {
		Utilisateur Utilisateur = urep.findById(idU)
				.orElseThrow(() -> new ResourceNotFoundException("Utilisateur not found for this id :: " + idU));
		return ResponseEntity.ok().body(Utilisateur);
	}

	 
	
	
	@PostMapping("/users")
	public Utilisateur createUtilisateur( @RequestBody Utilisateur Utilisateur) {
		return urep.save(Utilisateur);
	}
	@PutMapping("/updateuserupdate")
	public Utilisateur userupdateuser( @RequestBody Utilisateur u)
	{
		return ur.userupdateuser(u) ;
	}

}
