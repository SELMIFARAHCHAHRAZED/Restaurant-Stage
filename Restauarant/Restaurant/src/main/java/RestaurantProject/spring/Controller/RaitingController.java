package RestaurantProject.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import RestaurantProject.spring.Entities.Raiting;
import RestaurantProject.spring.Services.RaitingServices;

@RestController
public class RaitingController {
@Autowired
RaitingServices rateServ; 
@PostMapping("/addraiting")
public Raiting addU( @RequestBody Raiting rate) {
	  return  rateServ.addRate(rate); 
}
@PostMapping("/updaterate/{idrate}")
public Raiting updateRate(@RequestBody Raiting  rate,  @PathVariable("idrate") Integer idrate) {
	return  rateServ.updateRaiting(rate, idrate); 
	   
}
@DeleteMapping("/deleterate")
public void deleterating(@Param("idrate") Integer  idrate) {
	rateServ.deleteRating(idrate); 
}
@GetMapping("/getallrating")
public List<Raiting> getAllRaiting(){
	return rateServ.getAllRaiting();
}
}
