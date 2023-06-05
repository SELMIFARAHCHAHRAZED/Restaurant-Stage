package RestaurantProject.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import RestaurantProject.spring.Entities.Commande;
import RestaurantProject.spring.Entities.Plat;
import RestaurantProject.spring.Reposetory.PlatRepository;
import RestaurantProject.spring.Services.CommandeServices;

@RestController
@CrossOrigin("http://localhost:4200")
public class CommandeController {
	@Autowired
	CommandeServices comser;
	@Autowired
	PlatRepository prep; 
	@PostMapping("/addcommande")
	public Commande addC(@RequestBody Commande c)
	{
		return comser.addC(c);
	}
	@PostMapping("/addListCommande")
	   public List<Commande> addlisteCommande( @RequestBody List<Commande> lc){
		return comser.addlisteCommande(lc);
	}
	
	
	@PostMapping("/updatecommande/{idC}")
	   public Commande updateCommande(@RequestBody Commande c,  @PathVariable("idC") Integer idC) {
		return comser.updateCommande(c,idC);
		   
	   }
	
	
	 @DeleteMapping("/deletecommande")
	public void deleteCommande(Integer idCommande) {
		comser.deleteCommande(idCommande);
	}
	 
	 @GetMapping("/gettallcommandes")
	   public List<Commande> getAllCommande(){
		return comser.getAllCommande();
	   }
	 
	 @GetMapping("/getcommandebyetat/{ch}")
	   public List<Commande> getCommandeByEtatc( @PathVariable String ch ){
		   return comser.getCommandeByEtat(ch);
	   };
	 /*
	   @GetMapping("/getplatbyprixp/{idP}")
	   public List<Commande> getPlatByPrixP( @PathVariable Integer idP ){
		   return comser.getcommandebyprix(idP);
	   }
	  */
	   
	   
	   
	 
}
