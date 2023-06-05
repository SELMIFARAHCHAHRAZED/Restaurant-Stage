package RestaurantProject.spring.Controller;

import java.awt.Image;
import java.io.IOException;
import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import RestaurantProject.spring.Entities.Employer;
import RestaurantProject.spring.Entities.Job;
import RestaurantProject.spring.Entities.Plat;
import RestaurantProject.spring.Reposetory.PlatRepository;
import RestaurantProject.spring.Services.PlatServices;


@RestController
@CrossOrigin(origins  = "http://localhost:4200",maxAge = 3600)
public class PlatController {
	@Autowired
	PlatServices pr; 
	@Autowired
	PlatRepository platrep; 
   @PostMapping("/addplat")
	public Plat addPlat( @RequestBody Plat p) {
		  return pr.addPlat(p);
	}
   @PostMapping("/addListPlat")
   public List<Plat> addlistePlat( @RequestBody List<Plat> lp){
	return pr.addlistePlat(lp);
}
   @PostMapping("/addplattestnomp")
   public String addplatTestNomP( @RequestBody Plat p) {
	return pr.addPLatTestNomP(p);
	   
   }
   
   
   @PostMapping("/updateplat/{idP}")
   public Plat updatePlat(@RequestBody Plat p,  @PathVariable("idP") Integer idP) {
	return pr.updatePlat(p, idP);
   } 
   
   @DeleteMapping("/deleteplat")
   public void deletePlat(@Param("idP") Integer  idP) {
	   pr.deletePlat(idP);
   }
   
   @GetMapping("/gettallplat")
   public List<Plat> getAllPlatr(){
	return pr.getAllPlat();
   }
  /* 
   @GetMapping("/getplatbyprixp/{prixP}")
   public List<Plat> getPlatByPrixP( @PathVariable Float prixP ){
	   return pr.getUserByPrix(prixP);
   }*/
   
   
   @PostMapping("/addfileplat/{idP}")
	 public Plat addfile(@PathVariable("idP")  Integer idP, @RequestParam MultipartFile file  ) {
		 return pr.addFile(idP,file);
	 }
   @GetMapping("/getplatbyid/{idP}")
   public Plat getplatbyid(@PathVariable Integer idP) {
   	return platrep.findById(idP).get();
   }
   @PutMapping("/updateplatupdate")
   public Plat platupdateplat( @RequestBody Plat plat)
   {
   	return pr.platupdateplat(plat) ;
   }
   @GetMapping("/getprix/{idP}")
   public List<Plat>  getprix( @PathVariable Integer  idP) {
	   return pr.getprix(idP);
   }
   
   @GetMapping("/getidplat/{idP}")
   public List<Plat>  getidplat( @PathVariable Integer  idP) {
	   return pr.getidPlat(idP);
   }
}
