package RestaurantProject.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import RestaurantProject.spring.Entities.Reclam;
import RestaurantProject.spring.Entities.Utilisateur;
import RestaurantProject.spring.Services.ReclamServices;


@RestController
@CrossOrigin("http://localhost:4200")
public class ReclamController {
@Autowired
	ReclamServices recServ; 
	@PostMapping("/addreclam")
	public Reclam addRec( @RequestBody Reclam r)
	{
		return recServ.addReclam(r);
	}
	
@PostMapping("/addListreclam")
	   public List<Reclam> addlisteReclam( @RequestBody List<Reclam> lrec){
		return recServ.addlisteReclam(lrec);
		     
	}
	 
	 @PostMapping("/updateReclam/{idRec}")
	   public Reclam updateUser(@RequestBody Reclam rec,  @PathVariable("idRec") Integer idRec) {
		return recServ.updateReclam(rec, idRec);
		   
	   }
	 @DeleteMapping("/deletereclam")
	   public void deleteUser(@Param("idRec") Integer  idRec) {
		 recServ.deleteReclam(idRec);
	   }
	 
	 @GetMapping("/gettallreclam")
	   public List<Reclam> getAllRecam(){
		return recServ.getAllReclam();
	   }
	 @GetMapping("/getreclambytype/{ch}")
	   public List<Reclam> getReclam( @PathVariable String ch ){
		   return recServ.getReclamByType(ch);
	   }
	 @PutMapping("/updatereclamupdate")
		public Reclam updatereclamupdate( @RequestBody Reclam rec)
		{
			return recServ.reclamupdatereclam(rec);
		}
	 
}
