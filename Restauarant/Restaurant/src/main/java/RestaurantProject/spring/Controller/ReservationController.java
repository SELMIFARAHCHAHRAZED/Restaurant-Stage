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

import RestaurantProject.spring.Entities.Reservation;
import RestaurantProject.spring.Entities.Utilisateur;
import RestaurantProject.spring.Services.ReservationServices;

@RestController
@CrossOrigin("http://localhost:4200")
public class ReservationController {
	@Autowired
	ReservationServices resServ;
	 @PostMapping("/addreservation")
		public Reservation addReserv( @RequestBody Reservation reserv) {
			  return resServ.addReservation(reserv);
		}
	 
	 @PostMapping("/addListreservation")
	   public List<Reservation> addlisteReservation( @RequestBody List<Reservation> lreserv){
		return resServ.addlisteReservation(lreserv);
		      
	}
	 @PostMapping("/updatereservation/{idRe}")
	   public Reservation updateUser(@RequestBody Reservation reserv,  @PathVariable("idRe") Integer idRe) {
		return resServ.updateReservation(reserv, idRe);
		   
	 }
	 @DeleteMapping("/deletereservation")
	   public void deleteReservation(@Param("idRe") Integer  idRe) {
		 resServ.deleteReservation(idRe);
	   }
	 
	 
	 @GetMapping("/gettallresrvation")
	   public List<Reservation> getAllReservations(){
		return resServ.getAllReservation();
	   }
	 @GetMapping("/getreserbynom/{ch}")
	   public List<Reservation> getreservByNOmU( @PathVariable String ch ){
		   return resServ.getReservationbyNomU(ch);
	   }
	 @PutMapping("/updatereservupdate")
		public Reservation reservupdateuser( @RequestBody Reservation r)
		{
			return resServ.reservupdatereser(r) ;
		}
}
